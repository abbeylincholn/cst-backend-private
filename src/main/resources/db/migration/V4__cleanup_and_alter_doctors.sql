-- Drop foreign key constraints explicitly
ALTER TABLE appointments DROP CONSTRAINT IF EXISTS fk_appointments_doctor;
ALTER TABLE prescriptions DROP CONSTRAINT IF EXISTS fk_prescriptions_doctor;

-- Re-add foreign key constraints with consistent ON DELETE behavior
ALTER TABLE appointments
    ADD CONSTRAINT fk_appointments_doctor
        FOREIGN KEY (doctor_id)
            REFERENCES doctors(id)
            ON DELETE RESTRICT;

ALTER TABLE prescriptions
    ADD CONSTRAINT fk_prescriptions_doctor
        FOREIGN KEY (doctor_id)
            REFERENCES doctors(id)
            ON DELETE RESTRICT;

-- Preserve doctor_id data and update unique constraint
DO $$
    BEGIN
        IF EXISTS (SELECT 1 FROM information_schema.columns WHERE table_name = 'doctors' AND column_name = 'doctor_id') THEN
            ALTER TABLE doctors ADD COLUMN IF NOT EXISTS new_doctor_id VARCHAR(255);
            UPDATE doctors SET new_doctor_id = doctor_id;
            ALTER TABLE doctors DROP COLUMN IF EXISTS doctor_id;
            ALTER TABLE doctors RENAME COLUMN new_doctor_id TO doctor_id;
            ALTER TABLE doctors DROP CONSTRAINT IF EXISTS doctors_doctor_id_key;
            ALTER TABLE doctors ADD CONSTRAINT uc_doctors_doctor UNIQUE (doctor_id);
        END IF;
    END $$;

-- Alter departments table (check if columns need altering)
DO $$
    BEGIN
        IF EXISTS (SELECT 1 FROM information_schema.columns
                   WHERE table_name = 'departments'
                     AND column_name = 'contact_number'
                     AND data_type != 'character varying') THEN
            ALTER TABLE departments ALTER COLUMN contact_number TYPE VARCHAR(255);
        END IF;
        IF EXISTS (SELECT 1 FROM information_schema.columns
                   WHERE table_name = 'departments'
                     AND column_name = 'status'
                     AND data_type != 'character varying') THEN
            ALTER TABLE departments ALTER COLUMN status TYPE VARCHAR(255);
        END IF;
    END $$;

-- Set appointments primary key if not already set
DO $$
    BEGIN
        IF NOT EXISTS (
            SELECT 1 FROM pg_constraint
            WHERE conrelid = 'appointments'::regclass AND contype = 'p'
        ) THEN
            ALTER TABLE appointments ADD CONSTRAINT pk_appointments PRIMARY KEY (appointment_id);
        END IF;
    END $$;
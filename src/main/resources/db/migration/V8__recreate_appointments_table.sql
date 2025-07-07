CREATE TABLE appointments (
                              appointment_id BIGSERIAL PRIMARY KEY,
                              patient_id BIGINT NOT NULL,
                              doctor_id BIGINT NOT NULL,
                              scheduled_date DATE NOT NULL,
                              scheduled_time TIME NOT NULL,
                              duration VARCHAR(100),
                              note TEXT,
                              status VARCHAR(50) NOT NULL,
                              created_at TIMESTAMP,
                              updated_at TIMESTAMP,
                              created_by VARCHAR(255),
                              updated_by VARCHAR(255),
                              CONSTRAINT fk_appointments_patient FOREIGN KEY (patient_id) REFERENCES patients(patient_id) ON DELETE SET NULL,
                              CONSTRAINT fk_appointments_doctor FOREIGN KEY (doctor_id) REFERENCES doctors(id) ON DELETE SET NULL
);

COMMENT ON COLUMN appointments.status IS 'Enum: SCHEDULED, COMPLETED, CANCELLED';

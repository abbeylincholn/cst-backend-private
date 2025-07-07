-- ========================
-- V3__create_core_tables.sql
-- ========================

-- Patients Table
CREATE TABLE patients (
                          patient_id BIGSERIAL PRIMARY KEY,
                          first_name VARCHAR(255) NOT NULL,
                          last_name VARCHAR(255) NOT NULL,
                          date_of_birth DATE NOT NULL,
                          gender VARCHAR(50) NOT NULL,
                          phone_number VARCHAR(100),
                          email VARCHAR(255) NOT NULL,
                          address TEXT,
                          created_at TIMESTAMP,
                          updated_at TIMESTAMP,
                          created_by VARCHAR(255),
                          updated_by VARCHAR(255)
);

-- Invoices Table
CREATE TABLE invoices (
                          invoice_id BIGSERIAL PRIMARY KEY,
                          patient_id BIGINT NOT NULL,
                          amount NUMERIC(10, 2) NOT NULL,
                          due_date DATE,
                          total_amount NUMERIC(10, 2),
                          description TEXT,
                          status VARCHAR(50) NOT NULL,
                          created_at TIMESTAMP,
                          updated_at TIMESTAMP,
                          created_by VARCHAR(255),
                          updated_by VARCHAR(255),
                          CONSTRAINT fk_invoices_patient FOREIGN KEY (patient_id) REFERENCES patients(patient_id) ON DELETE SET NULL
);

-- Insurance Table
CREATE TABLE insurance (
                           insurance_id BIGSERIAL PRIMARY KEY,
                           patient_id BIGINT NOT NULL,
                           provider_name VARCHAR(255) NOT NULL,
                           insurance_type VARCHAR(255),
                           coverage_type TEXT,
                           status VARCHAR(50) NOT NULL,
                           created_at TIMESTAMP,
                           updated_at TIMESTAMP,
                           created_by VARCHAR(255),
                           updated_by VARCHAR(255),
                           CONSTRAINT fk_insurance_patient FOREIGN KEY (patient_id) REFERENCES patients(patient_id) ON DELETE SET NULL
);

-- Appointments Table
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

-- Prescriptions Table
CREATE TABLE prescriptions (
                               prescription_id BIGSERIAL PRIMARY KEY,
                               patient_id BIGINT NOT NULL,
                               doctor_id BIGINT NOT NULL,
                               dosage VARCHAR(255) NOT NULL,
                               frequency VARCHAR(255),
                               duration VARCHAR(255),
                               created_at TIMESTAMP,
                               updated_at TIMESTAMP,
                               created_by VARCHAR(255),
                               updated_by VARCHAR(255),
                               CONSTRAINT fk_prescriptions_patient FOREIGN KEY (patient_id) REFERENCES patients(patient_id) ON DELETE SET NULL,
                               CONSTRAINT fk_prescriptions_doctor FOREIGN KEY (doctor_id) REFERENCES doctors(id) ON DELETE SET NULL
);

-- Optional ENUM Comments
COMMENT ON COLUMN appointments.status IS 'Enum: SCHEDULED, COMPLETED, CANCELLED';
COMMENT ON COLUMN invoices.status IS 'Enum: PENDING, PAID, OVERDUE';
COMMENT ON COLUMN insurance.status IS 'Enum: ACTIVE, EXPIRED, CANCELLED';

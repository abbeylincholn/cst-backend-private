-- ========================
-- V2__create_doctors.sql
-- ========================

CREATE TABLE doctors (
                         id BIGSERIAL PRIMARY KEY,
                         doctor_id VARCHAR(255) UNIQUE,
                         department_id BIGINT NOT NULL,
                         first_name VARCHAR(100) NOT NULL,
                         last_name VARCHAR(100) NOT NULL,
                         specialization VARCHAR(255),
                         phone_number VARCHAR(50),
                         email VARCHAR(255),
                         licence_number VARCHAR(255),
                         availability VARCHAR(50),
                         created_at TIMESTAMP,
                         updated_at TIMESTAMP,

                         CONSTRAINT fk_doctor_department
                             FOREIGN KEY (department_id)
                                 REFERENCES departments(id)
                                 ON DELETE RESTRICT
);

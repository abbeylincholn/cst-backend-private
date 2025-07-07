-- ========================
-- V1__create_departments.sql
-- ========================

CREATE TABLE departments (
                             id BIGSERIAL PRIMARY KEY,
                             department_id VARCHAR(255) NOT NULL,
                             name VARCHAR(255) NOT NULL,
                             location VARCHAR(255),
                             contact_number VARCHAR(50),
                             specialty VARCHAR(255),
                             status VARCHAR(20) NOT NULL,
                             created_at TIMESTAMP,
                             updated_at TIMESTAMP
);

ALTER TABLE departments
    ADD CONSTRAINT uc_departments_department UNIQUE (department_id);

COMMENT ON COLUMN departments.status IS 'Enum: ACTIVE, INACTIVE, UNDER_MAINTENANCE';

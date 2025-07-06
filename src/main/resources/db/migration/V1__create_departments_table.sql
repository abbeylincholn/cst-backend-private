CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
CREATE TABLE IF NOT EXISTS departments (
                                           department_id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
                                           code VARCHAR(255) UNIQUE,
                                           name VARCHAR(255) NOT NULL,
                                           location VARCHAR(255),
                                           contact_number VARCHAR(100),
                                           specialty VARCHAR(255),
                                           status VARCHAR(50),
                                           created_at TIMESTAMP,
                                           created_by VARCHAR(255),
                                           updated_at TIMESTAMP,
                                           updated_by VARCHAR(255)
);

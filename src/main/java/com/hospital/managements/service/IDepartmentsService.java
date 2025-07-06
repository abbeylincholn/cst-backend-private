package com.hospital.managements.service;

import com.hospital.managements.dto.departmentDto.DepartmentsRequestDto;

public interface IDepartmentsService {
    void createDepartment(DepartmentsRequestDto departmentsRequestDto);

    /**
     * Creates a new department in the hospital management system.
     *
     * @param departmentsRequestDto the DTO containing the details of the department to be created
     */



}

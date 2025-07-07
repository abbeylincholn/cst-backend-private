package com.hospital.managements.mapper;

import com.hospital.managements.dto.departmentDto.DepartmentsRequestDto;
import com.hospital.managements.dto.departmentDto.DepartmentsResponseDto;
import com.hospital.managements.dto.departmentDto.DepartmentsUpdateDto;
import com.hospital.managements.entity.Departments;
import com.hospital.managements.enums.DepartmentsStatus;

public class DepartmentsMapper {

    // DepartmentsRequestDto → Entity
    public static Departments mapToDepartments(DepartmentsRequestDto departmentsRequestDto, Departments department) {
        department.setName(departmentsRequestDto.getName());
        department.setLocation(departmentsRequestDto.getLocation());
        department.setContactNumber(departmentsRequestDto.getContactNumber());
        department.setSpecialty(departmentsRequestDto.getSpecialty());
        department.setStatus(DepartmentsStatus.ACTIVE);
        return department;
    }
    // Entity → DepartmentsResponseDto
    public static DepartmentsResponseDto mapToResponseDto(Departments department, DepartmentsResponseDto departmentsResponseDto) {
        departmentsResponseDto.setCode(department.getDepartmentId());
        departmentsResponseDto.setName(department.getName());
        departmentsResponseDto.setLocation(department.getLocation());
        departmentsResponseDto.setContactNumber(department.getContactNumber());
        departmentsResponseDto.setSpecialty(department.getSpecialty());
        departmentsResponseDto.setStatus(department.getStatus());
        return departmentsResponseDto;
    }

    // Entity → DepartmentsUpdateDto
    public static DepartmentsUpdateDto mapToUpdateDto(Departments department, DepartmentsUpdateDto departmentsUpdateDto) {
        departmentsUpdateDto.setCode(department.getDepartmentId());
        departmentsUpdateDto.setName(department.getName());
        departmentsUpdateDto.setLocation(department.getLocation());
        departmentsUpdateDto.setContactNumber(department.getContactNumber());
        departmentsUpdateDto.setSpecialty(department.getSpecialty());
        if (departmentsUpdateDto.getStatus() != null) {
            department.setStatus(DepartmentsStatus.valueOf(departmentsUpdateDto.getStatus().name()));
        }
        return departmentsUpdateDto;
    }

}

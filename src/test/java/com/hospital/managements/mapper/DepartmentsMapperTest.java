package com.hospital.managements.mapper;

import com.hospital.managements.dto.departmentDto.DepartmentsRequestDto;
import com.hospital.managements.dto.departmentDto.DepartmentsResponseDto;
import com.hospital.managements.dto.departmentDto.DepartmentsUpdateDto;
import com.hospital.managements.entity.Departments;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepartmentsMapperTest {

    private static final String DEPARTMENT_ID = "DEPT001";

    @Test
    void testMapToEntity_FromRequestDto() {
        DepartmentsRequestDto requestDto = new DepartmentsRequestDto(
                "Cardiology", "Floor 3, West Wing", "080343645335", "Echocardiography"
        );

        Departments department = new Departments();
        department.setDepartmentId(DEPARTMENT_ID);
        DepartmentsMapper.mapToDepartments(requestDto, department);

        assertEquals("Cardiology", department.getName());
        assertEquals("Floor 3, West Wing", department.getLocation());
        assertEquals("080343645335", department.getContactNumber());
        assertEquals("Echocardiography", department.getSpecialty());
        assertEquals(DEPARTMENT_ID, department.getDepartmentId());

        System.out.println("Mapped Department: " + department);

    }

    @Test
    void testMapToResponseDto_FromEntity() {

        Departments department = new Departments();
        department.setDepartmentId(DEPARTMENT_ID);
        department.setName("Cardiology");
        department.setLocation("Floor 3, West Wing");
        department.setContactNumber("080343645335");
        department.setSpecialty("Echocardiography");

        DepartmentsResponseDto responseDto = new DepartmentsResponseDto();
        DepartmentsMapper.mapToResponseDto(department, responseDto);

        assertEquals(DEPARTMENT_ID, department.getDepartmentId());
        assertEquals("Cardiology", department.getName());
        assertEquals("Floor 3, West Wing", department.getLocation());
        assertEquals("080343645335", department.getContactNumber());
        assertEquals("Echocardiography", department.getSpecialty());

        System.out.println( "Mapped Department: " + department );

    }

    @Test
    void testMapToUpdateDto_FromEntity() {

        Departments department = new Departments();
        department.setDepartmentId(DEPARTMENT_ID);
        department.setName("Cardiology");
        department.setLocation("Floor 3, West Wing");
        department.setContactNumber("080343645335");
        department.setSpecialty("Cardiac Catheterization");

        DepartmentsUpdateDto updateDto = new DepartmentsUpdateDto();
        DepartmentsMapper.mapToUpdateDto(department, updateDto);

        assertEquals(DEPARTMENT_ID, department.getDepartmentId());
        assertEquals("Cardiology", department.getName());
        assertEquals("Floor 3, West Wing", department.getLocation());
        assertEquals("080343645335", department.getContactNumber());
        assertEquals("Cardiac Catheterization", department.getSpecialty());

        System.out.println("Mapped Department: " + department);
    }

}

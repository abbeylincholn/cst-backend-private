package com.hospital.managements.dto.doctorsDto;

import com.hospital.managements.dto.departmentDto.BaseDepartmentsDto;
import lombok.*;

@Data
public class DoctorsResponseDto {
    private Long doctorId;
    private String firstName;
    private String lastName;
    private String specialization;
    private String phoneNumber;
    private String email;
    private BaseDepartmentsDto departmentsResponseDto;
}
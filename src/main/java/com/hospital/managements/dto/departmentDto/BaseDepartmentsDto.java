package com.hospital.managements.dto.departmentDto;

import com.hospital.managements.enums.DepartmentsStatus;
import lombok.*;

@Data
public abstract class BaseDepartmentsDto {
    private String code;
    private String name;
    private String location;
    private String contactNumber;
    private String specialty;
    private DepartmentsStatus status;
}

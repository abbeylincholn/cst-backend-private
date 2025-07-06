package com.hospital.managements.dto.departmentDto;

import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor
public class DepartmentsRequestDto {
    private String name;
    private String location;
    private String contactNumber;
    private String specialty;
}

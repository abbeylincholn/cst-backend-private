package com.hospital.managements.dto.doctorsDto;

import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor
public class DoctorsCreateDto {
    private String firstName;
    private String lastName;
    private String specialization;
    private String phoneNumber;
    private String email;
    private Long departmentId;
}

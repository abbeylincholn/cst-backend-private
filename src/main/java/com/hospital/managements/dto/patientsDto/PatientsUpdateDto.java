package com.hospital.managements.dto.patientsDto;

import lombok.*;

import java.time.LocalDate;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class PatientsUpdateDto {
    private Long patientId;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String gender;
    private String phoneNumber;
    private String email;
    private String address;
}

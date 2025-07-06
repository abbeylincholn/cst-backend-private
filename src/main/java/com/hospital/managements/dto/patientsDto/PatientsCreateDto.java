package com.hospital.managements.dto.patientsDto;

import lombok.*;

import java.time.LocalDate;

@Data @AllArgsConstructor @NoArgsConstructor
public class PatientsCreateDto {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String gender;
    private String phoneNumber;
    private String email;
    private String address;


}
package com.hospital.managements.dto.prescriptionsDto;

import com.hospital.managements.dto.doctorsDto.DoctorsResponseDto;
import com.hospital.managements.dto.patientsDto.PatientsResponseDto;
import lombok.*;

@Data
public class PrescriptionsResponseDto {
    private Long prescriptionId;
    private PatientsResponseDto patient;
    private DoctorsResponseDto doctor;
    private String dosage;
    private String frequency;
    private String duration;
}
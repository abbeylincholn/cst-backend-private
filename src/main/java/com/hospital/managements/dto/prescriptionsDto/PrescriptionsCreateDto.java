package com.hospital.managements.dto.prescriptionsDto;

import lombok.*;

@Data
public class PrescriptionsCreateDto {
    private Long patientId;
    private Long doctorId;
    private String dosage;
    private String frequency;
    private String duration;
}
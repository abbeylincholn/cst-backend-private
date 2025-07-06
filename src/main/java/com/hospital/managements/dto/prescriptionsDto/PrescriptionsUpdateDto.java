package com.hospital.managements.dto.prescriptionsDto;

import lombok.*;

@Data
public class PrescriptionsUpdateDto {
    private Long prescriptionId;
    private Long patientId;
    private Long doctorId;
    private String dosage;
    private String frequency;
    private String duration;
}
package com.hospital.managements.dto.insuranceDto;

import lombok.*;

@Data
public class InsuranceUpdateDto {
    private Long insuranceId;
    private Long patientId;
    private String providerName;
    private String planType;
    private String coverageDetails;
}
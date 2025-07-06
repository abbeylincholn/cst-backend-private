package com.hospital.managements.dto.insuranceDto;

import lombok.*;

@Data
public class InsuranceCreateDto {
    private Long patientId;
    private String providerName;
    private String planType;
    private String coverageDetails;
}
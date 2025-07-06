package com.hospital.managements.dto.insuranceDto;

import com.hospital.managements.dto.patientsDto.PatientsResponseDto;
import lombok.*;

@Data
public class InsuranceResponseDto {
    private Long insuranceId;
    private PatientsResponseDto patient;
    private String providerName;
    private String planType;
    private String coverageDetails;
}
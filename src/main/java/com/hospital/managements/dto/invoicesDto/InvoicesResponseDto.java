package com.hospital.managements.dto.invoicesDto;

import com.hospital.managements.dto.patientsDto.PatientsResponseDto;
import lombok.*;

import java.time.LocalDate;

@Data
public class InvoicesResponseDto {
    private Long invoiceId;
    private PatientsResponseDto patient;
    private Double amount;
    private LocalDate dueDate;
    private String status;
}
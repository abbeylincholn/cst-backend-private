package com.hospital.managements.dto.invoicesDto;

import lombok.*;

import java.time.LocalDate;

@Data
public class InvoicesCreateDto {
    private Long patientId;
    private Double amount;
    private LocalDate dueDate;
    private String status;
}

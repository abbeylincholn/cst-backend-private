package com.hospital.managements.dto.appointmentsDto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class AppointmentsCreateDto {
    private Long patientId;
    private Long doctorId;
    private LocalDate scheduledDate;
    private LocalTime scheduledTime;
    private String status;
}

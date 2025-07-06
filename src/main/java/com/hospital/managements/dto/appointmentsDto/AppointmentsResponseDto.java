package com.hospital.managements.dto.appointmentsDto;

import com.hospital.managements.dto.doctorsDto.DoctorsResponseDto;
import com.hospital.managements.dto.patientsDto.PatientsResponseDto;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class AppointmentsResponseDto {
    private Long appointmentId;
    private PatientsResponseDto patient;
    private DoctorsResponseDto doctor;
    private LocalDate scheduledDate;
    private LocalTime scheduledTime;
    private String status;
}
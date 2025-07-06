package com.hospital.managements.mapper;

import com.hospital.managements.dto.patientsDto.PatientsCreateDto;
import com.hospital.managements.dto.patientsDto.PatientsResponseDto;
import com.hospital.managements.dto.patientsDto.PatientsUpdateDto;
import com.hospital.managements.entity.Patients;

public class PatientsMapper {
    // PatientsCreateDto → Entity
    public static Patients mapToPatients(PatientsCreateDto patientsCreateDto, Patients patients) {
        patients.setFirstName(patientsCreateDto.getFirstName());
        patients.setLastName(patientsCreateDto.getLastName());
        patients.setBirthDate(patientsCreateDto.getBirthDate());
        patients.setGender(patientsCreateDto.getGender());
        patients.setPhoneNumber(patientsCreateDto.getPhoneNumber());
        patients.setEmail(patientsCreateDto.getEmail());
        patients.setAddress(patientsCreateDto.getAddress());
        return patients;
    }

    // PatientsUpdateDto → Entity
    public static Patients mapToPatientsUpdateDto(Patients patients, PatientsUpdateDto patientsUpdateDto) {
        patients.setFirstName(patientsUpdateDto.getFirstName());
        patients.setLastName(patientsUpdateDto.getLastName());
        patients.setBirthDate(patientsUpdateDto.getBirthDate());
        patients.setGender(patientsUpdateDto.getGender());
        patients.setPhoneNumber(patientsUpdateDto.getPhoneNumber());
        patients.setEmail(patientsUpdateDto.getEmail());
        patients.setAddress(patientsUpdateDto.getAddress());
        return patients;
    }

    // Entity → PatientsResponseDto
    public static PatientsResponseDto mapToResponseDto(Patients patients, PatientsResponseDto patientsResponseDto) {
        patientsResponseDto.setPatientId(patients.getPatientId());
        patientsResponseDto.setFirstName(patients.getFirstName());
        patientsResponseDto.setLastName(patients.getLastName());
        patientsResponseDto.setBirthDate(patients.getBirthDate());
        patientsResponseDto.setGender(patients.getGender());
        patientsResponseDto.setPhoneNumber(patients.getPhoneNumber());
        patientsResponseDto.setEmail(patients.getEmail());
        patientsResponseDto.setAddress(patients.getAddress());
        return patientsResponseDto;
    }




}

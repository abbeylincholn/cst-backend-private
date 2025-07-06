package com.hospital.managements.mapper;

import com.hospital.managements.dto.doctorsDto.DoctorsCreateDto;
import com.hospital.managements.dto.doctorsDto.DoctorsUpdateDto;
import com.hospital.managements.dto.doctorsDto.DoctorsResponseDto;
import com.hospital.managements.entity.Departments;
import com.hospital.managements.entity.Doctors;

public class DoctorsMapper {

    // DoctorsCreateDto → Entity
    public static Doctors mapToEntity(DoctorsCreateDto doctorsCreateDto, Doctors doctors, Departments department) {
        doctors.setFirstName(doctorsCreateDto.getFirstName());
        doctors.setLastName(doctorsCreateDto.getLastName());
        doctors.setSpecialization(doctorsCreateDto.getSpecialization());
        doctors.setPhoneNumber(doctorsCreateDto.getPhoneNumber());
        doctors.setEmail(doctorsCreateDto.getEmail());
        doctors.setDepartment(department);
        return doctors;
    }// ✅ field name in entity

    // DoctorsUpdateDto → Entity
        public static Doctors mapToEntity(DoctorsUpdateDto doctorsUpdateDto, Doctors doctors, Departments department) {
            doctors.setFirstName(doctorsUpdateDto.getFirstName());
            doctors.setLastName(doctorsUpdateDto.getLastName());
            doctors.setSpecialization(doctorsUpdateDto.getSpecialization());
            doctors.setPhoneNumber(doctorsUpdateDto.getPhoneNumber());
            doctors.setEmail(doctorsUpdateDto.getEmail());
            doctors.setDepartment(department); // set the Departments object
            return doctors;
        }
    // Entity → DoctorsResponseDto
    public static DoctorsResponseDto mapToResponseDto(Doctors doctors, DoctorsResponseDto doctorsResponseDto, Departments department) {
        doctorsResponseDto.setDoctorId(doctors.getDoctorId());
        doctorsResponseDto.setFirstName(doctors.getFirstName());
        doctorsResponseDto.setLastName(doctors.getLastName());
        doctorsResponseDto.setSpecialization(doctors.getSpecialization());
        doctorsResponseDto.setPhoneNumber(doctors.getPhoneNumber());
        doctorsResponseDto.setEmail(doctors.getEmail());
        doctors.setDepartment(department);
        return doctorsResponseDto;
    }
}

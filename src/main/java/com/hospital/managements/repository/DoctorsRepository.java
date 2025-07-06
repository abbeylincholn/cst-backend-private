package com.hospital.managements.repository;

import com.hospital.managements.entity.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoctorsRepository extends JpaRepository<Doctors, Long> {
    Optional<Doctors> findByDoctorId(Long doctorId);
}
package com.hospital.managements.repository;

import com.hospital.managements.entity.Patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientsRepository extends JpaRepository<Patients, Long> {
   Optional<Patients> findByPatientId(Long patientId);
}

package com.hospital.managements.repository;

import com.hospital.managements.entity.Prescriptions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PrescriptionsRepository extends JpaRepository<Prescriptions, Long> {
    Optional<Prescriptions> findByPrescriptionId(Long prescriptionId);
}
package com.hospital.managements.repository;

import com.hospital.managements.entity.Appointments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppointmentsRepository extends JpaRepository<Appointments, Long> {
    Optional<Appointments> findByAppointmentId(Long appointmentId);
}
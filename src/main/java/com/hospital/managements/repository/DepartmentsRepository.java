package com.hospital.managements.repository;

import com.hospital.managements.entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentsRepository extends JpaRepository<Departments, Long> {
    Optional<Departments> findByDepartmentId(String departmentId);
    Optional<Departments> findByName(String name);
}
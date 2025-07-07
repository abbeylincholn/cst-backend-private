package com.hospital.managements.entity;

import com.hospital.managements.enums.DepartmentsStatus;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Departments extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // now uses SERIAL/auto-increment

    @Column(name = "department_id", unique = true)
    private String departmentId; // DEPT001-style code

    private String name;

    private String location;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "specialty")
    private String specialty;

    @Enumerated(EnumType.STRING)
    private DepartmentsStatus status;

}



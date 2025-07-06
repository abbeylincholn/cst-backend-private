package com.hospital.managements.entity;

import com.hospital.managements.enums.DepartmentsStatus;
import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Departments extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "department_id", columnDefinition = "UUID")
    private UUID departmentId;

    @Column(unique = true)
    private String code;

    private String name;

    private String location;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "specialty")
    private String specialty;

    @Enumerated(EnumType.STRING)
    private DepartmentsStatus status;

}



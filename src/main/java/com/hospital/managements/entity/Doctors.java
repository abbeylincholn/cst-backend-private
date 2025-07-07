package com.hospital.managements.entity;

import com.hospital.managements.enums.DoctorsAvailability;
import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
@Entity
public class Doctors extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "doctor_id", unique = true)
    private String doctorId;  // DOC001-style code

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String specialty;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String email;

    private String licenceNumber;

    @Enumerated(EnumType.STRING)
    private DoctorsAvailability availability;

    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "id") // links to Departments.id
    private Departments department;



}

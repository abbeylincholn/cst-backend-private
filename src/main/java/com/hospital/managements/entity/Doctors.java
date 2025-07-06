package com.hospital.managements.entity;

import com.hospital.managements.enums.DoctorsAvailability;
import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
@Entity
public class Doctors extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id")
    private Long doctorId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String specialization;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String email;

    private String licenceNumber;

    @Enumerated(EnumType.STRING)
    private DoctorsAvailability availability;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Departments department;




}

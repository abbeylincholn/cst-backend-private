package com.hospital.managements.entity;

import com.hospital.managements.enums.InsuranceStatus;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Insurance extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "insurance_id")
    private Long insuranceId;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patients patient;

    @Column(name = "provider_name")
    private String providerName;

    @Column(name = "insurance_type")
    private String InsuranceType;

    @Column(name = "coverage_type", columnDefinition = "TEXT")
    private String coverageType;

    @Enumerated(EnumType.STRING)
    private InsuranceStatus status;
}

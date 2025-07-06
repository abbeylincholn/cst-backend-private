package com.hospital.managements.entity;

import com.hospital.managements.enums.InvoiceStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Invoices extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_id")
    private Long invoiceId;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patients patient;

    private Double amount;

    @Column(name = "due_date")
    private LocalDate dueDate;

    private Double totalAmount;

    private String description;

    @Enumerated(EnumType.STRING)
    private InvoiceStatus status;
}
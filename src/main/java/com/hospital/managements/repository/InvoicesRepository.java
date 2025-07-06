package com.hospital.managements.repository;

import com.hospital.managements.entity.Invoices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InvoicesRepository extends JpaRepository<Invoices, Long> {
    Optional<Invoices> findByInvoiceId(Long invoiceId);
}
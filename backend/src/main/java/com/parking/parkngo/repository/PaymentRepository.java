package com.parking.parkngo.repository;

import com.parking.parkngo.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    Payment findByTransactionId(String transactionId);
}

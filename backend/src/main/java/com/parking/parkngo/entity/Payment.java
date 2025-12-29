package com.parking.parkngo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne
    @JoinColumn(name = "booking_id", nullable = false)
    Booking booking;

    @Column(name = "amount", nullable = false)
    Double amount;

    @Column(name = "transaction_id")
    String transactionId;

    @Column(name = "payment_method")
    String paymentMethod;

    @Column(name = "payment_status", nullable = false)
    String paymentStatus;

    @Column(name = "paid_at")
    java.sql.Timestamp paidAt;

}

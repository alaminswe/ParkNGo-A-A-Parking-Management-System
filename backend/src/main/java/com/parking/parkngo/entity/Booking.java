package com.parking.parkngo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bookings", indexes = {
        @Index(columnList = "spot_id"),
        @Index(columnList = "customer_id")
})
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "spot_id", nullable = false)
    Long spotId;

    @Column(name = "customer_id", nullable = false)
    Long customerId;

    @Column(name = "booking_date", nullable = false)
    LocalDate bookingDate;

    @Column(name = "start_time", nullable = false)
    LocalTime startTime;

    @Column(name = "end_time", nullable = false)
    LocalTime endTime;

    @Column(name = "total_cost", precision = 10, scale = 2)
    BigDecimal totalCost;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_status", nullable = false)
    com.parking.parkngo.enums.PaymentStatus paymentStatus = com.parking.parkngo.enums.PaymentStatus.pending;

    @Column(name = "created_at", nullable = false, updatable = false)
    LocalDateTime createdAt = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    com.parking.parkngo.enums.BookingStatus status = com.parking.parkngo.enums.BookingStatus.active;

}

package com.parking.parkngo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "name")
    String name;

    @Column(name = "email", unique = true)
    String email;

    @Column(name = "phone")
    String phone;

    @Column(name = "password_hash")
    String passwordHash;

    @Column(name = "role")
    String role;   // customer, host, admin

    @Column(name = "created_at")
    LocalDateTime createdAt;

    @Column(name = "vehicle_type")
    String vehicleType;

    @Column(name = "license_plate")
    String licensePlate;

    public User() {}
}

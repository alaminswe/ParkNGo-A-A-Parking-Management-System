package com.parking.parkngo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pm_payment_type")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "code")
    String code;

    @Column(name = "active")
    Boolean active;
}

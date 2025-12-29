package com.parking.parkngo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "spot_availability")
public class SpotAvailability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne
    @JoinColumn(name = "spot_id", nullable = false)
    ParkingSpot parkingSpot;

    @Column(name = "day_of_week", nullable = false)
    String dayOfWeek;

    @Column(name = "start_time", nullable = false)
    String startTime;

    @Column(name = "end_time", nullable = false)
    String endTime;

}

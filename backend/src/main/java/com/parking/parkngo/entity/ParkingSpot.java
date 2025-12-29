package com.parking.parkngo.entity;

import com.parking.parkngo.enums.SpotStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "parking_spots")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ParkingSpot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;

    @Column(name = "address")
    String address;

    @Column(name = "latitude")
    Double latitude;

    @Column(name = "longitude")
    Double longitude;

    @Column(name = "hourly_rate")
    Double hourlyRate;

    @Column(name = "currency")
    String currency;

    @Column(name = "photo_path")
    String photoPath;

    @Column(name = "vehicle_types")
    String vehicletypes;

    @Enumerated(EnumType.STRING)
    @Column(name = "spot_status")
    SpotStatus spotStatus;
}

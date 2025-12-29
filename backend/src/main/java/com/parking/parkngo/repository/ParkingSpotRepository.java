package com.parking.parkngo.repository;

import com.parking.parkngo.entity.ParkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, Integer> {
}

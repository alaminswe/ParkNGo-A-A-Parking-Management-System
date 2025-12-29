package com.parking.parkngo.repository;

import com.parking.parkngo.entity.SpotAvailability;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SpotAvailabilityRepository extends JpaRepository<SpotAvailability, Integer> {

    List<SpotAvailability> findByParkingSpotId(Integer spotId);
}

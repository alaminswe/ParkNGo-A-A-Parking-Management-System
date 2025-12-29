package com.parking.parkngo.repository;


import com.parking.parkngo.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByCustomerId(Long customerId);

    List<Booking> findBySpotId(Long spotId);
}
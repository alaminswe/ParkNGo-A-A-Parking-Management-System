package com.parking.parkngo.service;

import com.parking.parkngo.dto.ParkingSpotDTO;
import com.parking.parkngo.entity.ParkingSpot;
import com.parking.parkngo.exception.ServiceNotFoundException;
import com.parking.parkngo.mapper.ParkingSpotMapper;
import com.parking.parkngo.repository.BookingRepository;
import com.parking.parkngo.repository.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;
    

}

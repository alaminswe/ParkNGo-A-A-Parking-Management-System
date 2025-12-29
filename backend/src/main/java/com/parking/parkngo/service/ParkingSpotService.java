package com.parking.parkngo.service;

import com.parking.parkngo.dto.ParkingSpotDTO;
import com.parking.parkngo.entity.ParkingSpot;
import com.parking.parkngo.exception.ServiceNotFoundException;
import com.parking.parkngo.mapper.ParkingSpotMapper;
import com.parking.parkngo.repository.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParkingSpotService {

    @Autowired
    private ParkingSpotRepository parkingSpotRepository;
    
    public List<ParkingSpotDTO> findAll() {
        
        List<ParkingSpotDTO> parkingSpotDTOS = null;
        List<ParkingSpot> parkingSpots = parkingSpotRepository.findAll();

        if (!parkingSpots.isEmpty()) {
            parkingSpotDTOS = parkingSpots.stream()
                    .map(ParkingSpotMapper::convertToDTO)
                    .collect(Collectors.toList());
        } else {
            throw new ServiceNotFoundException("Data not Found!!");
        }
        return parkingSpotDTOS;
    }
}

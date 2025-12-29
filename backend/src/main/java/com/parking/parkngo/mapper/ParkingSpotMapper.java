package com.parking.parkngo.mapper;

import com.parking.parkngo.dto.ParkingSpotDTO;
import com.parking.parkngo.entity.ParkingSpot;

public class ParkingSpotMapper {
    public static ParkingSpotDTO convertToDTO(ParkingSpot parkingSpot){
        ParkingSpotDTO parkingSpotDTO = new ParkingSpotDTO();
        parkingSpotDTO.setId(parkingSpot.getId());
        parkingSpotDTO.setName(parkingSpot.getName());
        parkingSpotDTO.setDescription(parkingSpot.getDescription());
        parkingSpotDTO.setAddress(parkingSpot.getAddress());
        parkingSpotDTO.setLatitude(parkingSpot.getLatitude());
        parkingSpotDTO.setLongitude(parkingSpot.getLongitude());
        parkingSpotDTO.setHourlyRate(parkingSpot.getHourlyRate());
        parkingSpotDTO.setCurrency(parkingSpot.getCurrency());
        parkingSpotDTO.setPhotoPath(parkingSpot.getPhotoPath());
        parkingSpotDTO.setVehicletypes(parkingSpot.getVehicletypes());
        parkingSpotDTO.setSpotStatus(parkingSpot.getSpotStatus());
        return parkingSpotDTO;
    }
}

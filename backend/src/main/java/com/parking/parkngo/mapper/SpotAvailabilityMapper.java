package com.parking.parkngo.mapper;

import com.parking.parkngo.dto.BookingDTO;
import com.parking.parkngo.dto.SpotAvailabilityDTO;
import com.parking.parkngo.entity.Booking;
import com.parking.parkngo.entity.SpotAvailability;

public class SpotAvailabilityMapper {
    public static SpotAvailabilityDTO convertToDTO(SpotAvailability a){
        SpotAvailabilityDTO dto = new SpotAvailabilityDTO();
        dto.setId(a.getId());
        dto.setSpotId(a.getParkingSpot().getId());
        dto.setDayOfWeek(a.getDayOfWeek());
        dto.setStartTime(a.getStartTime());
        dto.setEndTime(a.getEndTime());
        return dto;
    }
}

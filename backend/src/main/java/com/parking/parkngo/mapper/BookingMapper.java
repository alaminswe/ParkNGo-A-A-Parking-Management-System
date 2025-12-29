package com.parking.parkngo.mapper;

import com.parking.parkngo.dto.BookingDTO;
import com.parking.parkngo.entity.Booking;

public class BookingMapper {
    public static BookingDTO convertToDTO(Booking booking){
        BookingDTO dto = new BookingDTO();
        dto.setId(booking.getId());
        dto.setSpotId(booking.getSpotId());
        dto.setCustomerId(booking.getCustomerId());
        dto.setBookingDate(booking.getBookingDate());
        dto.setStartTime(booking.getStartTime());
        dto.setEndTime(booking.getEndTime());
        dto.setTotalCost(booking.getTotalCost());
        dto.setPaymentStatus(booking.getPaymentStatus());
        dto.setCreatedAt(booking.getCreatedAt());
        dto.setStatus(booking.getStatus());
        return dto;
    }
}

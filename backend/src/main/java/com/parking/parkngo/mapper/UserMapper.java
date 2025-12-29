package com.parking.parkngo.mapper;

import com.parking.parkngo.dto.BookingDTO;
import com.parking.parkngo.dto.UserDTO;
import com.parking.parkngo.entity.Booking;
import com.parking.parkngo.entity.User;

public class UserMapper {
    public static UserDTO convertToDTO(User user){
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setPhone(user.getPhone());
        dto.setRole(user.getRole());
        dto.setVehicleType(user.getVehicleType());
        dto.setLicensePlate(user.getLicensePlate());
        return dto;
    }

}

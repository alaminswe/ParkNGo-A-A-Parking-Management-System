package com.parking.parkngo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.parking.parkngo.enums.BookingStatus;
import com.parking.parkngo.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {
    private Integer id;
    private String name;
    private String email;
    private String phone;
    private String role;
    private String vehicleType;
    private String licensePlate;
}

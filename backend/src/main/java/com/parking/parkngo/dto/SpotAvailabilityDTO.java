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
public class SpotAvailabilityDTO {
    private Integer id;
    private Integer spotId;
    private String dayOfWeek;
    private String startTime;
    private String endTime;
}

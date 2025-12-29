package com.parking.parkngo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParkingSpotDTO {
    private Integer id;
    private String name;
    private String description;
    private String address;
    private Double latitude;
    private Double longitude;
    private Double hourlyRate;
    private String currency;
    private String photoPath;
    private String vehicletypes;
    private String spotStatus;
}

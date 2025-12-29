package com.parking.parkngo.controller;

import com.parking.parkngo.dto.ApiDTO;
import com.parking.parkngo.dto.ParkingSpotDTO;
import com.parking.parkngo.service.ParkingSpotService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/parking/spot")
@Tag(name="Parking Spot")
public class ParkingSpotController {

    @Autowired
    ParkingSpotService parkingSpotService;

    @Operation(summary = "This is to fetch All the Data")
    @GetMapping
    public ResponseEntity<ApiDTO> findAll(){
        List<ParkingSpotDTO> parkingSpotDTOS = parkingSpotService.findAll();
        ApiDTO<List<ParkingSpotDTO>> responseDTO = ApiDTO
                .<List<ParkingSpotDTO>>builder()
                .status(true)
                .message("Data Found")
                .data(parkingSpotDTOS)
                .build();
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

}

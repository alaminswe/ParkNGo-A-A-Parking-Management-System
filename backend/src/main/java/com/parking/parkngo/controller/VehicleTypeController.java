package com.parking.parkngo.controller;

import com.parking.parkngo.dao.VehicleTypeDAO;
import com.parking.parkngo.dto.ApiDTO;
import com.parking.parkngo.dto.VehicleTypeDTO;
import com.parking.parkngo.service.VehicleTypeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/vehicle/type")
@Tag(name="Vehicle Type")
@CrossOrigin(origins = "http://localhost:4200")
public class VehicleTypeController {

    @Autowired
    VehicleTypeService vehicleTypeService;

    @Operation(summary = "This is to fetch All the Data")
    @GetMapping
    public ResponseEntity<ApiDTO> findAll(){
        List<VehicleTypeDTO> vehicleTypeDTOS = vehicleTypeService.findAll();
        ApiDTO<List<VehicleTypeDTO>> responseDTO = ApiDTO
                .<List<VehicleTypeDTO>>builder()
                .status(true)
                .message("Data Found")
                .data(vehicleTypeDTOS)
                .build();
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @Operation(summary = "This is to fetch All the Data Active")
    @GetMapping("/active")
    public ResponseEntity<ApiDTO> findAllByActive(){
        List<VehicleTypeDTO> vehicleTypeDTOS = vehicleTypeService.findAllByActive();
        ApiDTO<List<VehicleTypeDTO>> responseDTO = ApiDTO
                .<List<VehicleTypeDTO>>builder()
                .status(true)
                .message("Data Found")
                .data(vehicleTypeDTOS)
                .build();
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }


    @Operation(summary = "Get One Data")
    @GetMapping("/find")
    public ResponseEntity<ApiDTO> findOne(@RequestParam Long id){
        VehicleTypeDTO vehicleTypeDTO = vehicleTypeService.findById(id);
        ApiDTO<VehicleTypeDTO> responseDTO = ApiDTO
                .<VehicleTypeDTO>builder()
                .status(true)
                .message("Data Found")
                .data(vehicleTypeDTO)
                .build();
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }


    @Operation(summary = "Save Data")
    @PostMapping
    public ResponseEntity<ApiDTO> save(@RequestBody @Valid VehicleTypeDAO vehicleTypeDAO){
        String user_id = "system";
        ApiDTO responseDTO = vehicleTypeService.save(null,vehicleTypeDAO,user_id);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    @Operation(summary = "Update Data")
    @PutMapping
    public ResponseEntity<ApiDTO> update(@RequestParam Long id, @RequestBody @Valid VehicleTypeDAO vehicleTypeDAO){
        String user_id = "system";
        ApiDTO responseDTO = vehicleTypeService.save(id,vehicleTypeDAO,user_id);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    @Operation(summary = "Delete Data")
    @DeleteMapping
    public ResponseEntity<ApiDTO> delete(@RequestParam Long id){
        String user_id = "system";
        ApiDTO responseDTO = vehicleTypeService.delete(id,user_id);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}

package com.parking.parkngo.controller;


import com.parking.parkngo.dao.UserTypeDAO;
import com.parking.parkngo.dto.ApiDTO;
import com.parking.parkngo.dto.UserTypeDTO;
import com.parking.parkngo.service.UserTypeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/type")
@Tag(name="User Type")
public class UserTypeController {

    @Autowired
    UserTypeService userTypeService;

    @Operation(summary = "This is to fetch All the Data")
    @GetMapping
    public ResponseEntity<ApiDTO> findAll(){
        List<UserTypeDTO> userTypeDTOS = userTypeService.findAll();
        ApiDTO<List<UserTypeDTO>> responseDTO = ApiDTO
                .<List<UserTypeDTO>>builder()
                .status(true)
                .message("Data Found")
                .data(userTypeDTOS)
                .build();
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @Operation(summary = "This is to fetch All the Data Active")
    @GetMapping("/active")
    public ResponseEntity<ApiDTO> findAllByActive() {
        List<UserTypeDTO> userTypeDTOS = userTypeService.findAllByActive();
        ApiDTO<List<UserTypeDTO>> responseDTO = ApiDTO
                .<List<UserTypeDTO>>builder()
                .status(true)
                .message("Data Found")
                .data(userTypeDTOS)
                .build();
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @Operation(summary = "Get One Data")
    @GetMapping("/find-{id}")
    public ResponseEntity<ApiDTO> findOne(Long id) {
        UserTypeDTO userTypeDTO = userTypeService.findById(id);
        ApiDTO<UserTypeDTO> responseDTO = ApiDTO
                .<UserTypeDTO>builder()
                .status(true)
                .message("Data Found")
                .data(userTypeDTO)
                .build();
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
    @Operation(summary = "Save Data")
    @PostMapping
    public ResponseEntity<ApiDTO> save(@RequestBody @Valid UserTypeDAO userTypeDAO){
        String user_id = "system"; //later change korte hobe session theke niye
        ApiDTO responseDTO = userTypeService.save(null,userTypeDAO,user_id);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }
    @Operation(summary = "Update Data")
    @PutMapping
    public ResponseEntity<ApiDTO> update(@RequestParam Long id,
                                         @RequestBody @Valid UserTypeDAO userTypeDAO){
        String user_id = "system"; //later change korte hobe session theke niye
        ApiDTO responseDTO = userTypeService.save(id,userTypeDAO,user_id);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    @Operation(summary = "Delete Data")
    @DeleteMapping
    public ResponseEntity<ApiDTO> delete(@RequestParam Long id) {
        String user_id = "system"; //later change korte hobe session theke niye
        ApiDTO responseDTO = userTypeService.delete(id, user_id);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}

package com.parking.parkngo.controller;

import com.parking.parkngo.dto.ApiDTO;
import com.parking.parkngo.dto.PaymentTypeDTO;
import com.parking.parkngo.service.PaymentTypeService;
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
@RequestMapping("/api/payment/type")
@Tag(name="Payment Type")
public class PaymentTypeController {

    @Autowired
    PaymentTypeService paymentTypeService;

    @Operation(summary = "This is to fetch All the Data")
    @GetMapping
    public ResponseEntity<ApiDTO> findAll(){
        List<PaymentTypeDTO> paymentTypeDTOS = paymentTypeService.findAll();
        ApiDTO<List<PaymentTypeDTO>> responseDTO = ApiDTO
                .<List<PaymentTypeDTO>>builder()
                .status(true)
                .message("Data Found")
                .data(paymentTypeDTOS)
                .build();
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

}

package com.parking.parkngo.service;

import com.parking.parkngo.dto.PaymentTypeDTO;
import com.parking.parkngo.entity.PaymentType;
import com.parking.parkngo.exception.ServiceNotFoundException;
import com.parking.parkngo.mapper.PaymentTypeMapper;
import com.parking.parkngo.mapper.VehicleTypeMapper;
import com.parking.parkngo.repository.PaymentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaymentTypeService {

    @Autowired
    private PaymentTypeRepository paymentTypeRepository;
    
    public List<PaymentTypeDTO> findAll() {
        
        List<PaymentTypeDTO> paymentTypeDTOS = null;
        List<PaymentType> paymentTypes = paymentTypeRepository.findAll();

        if (!paymentTypes.isEmpty()) {
            paymentTypeDTOS = paymentTypes.stream()
                    .map(PaymentTypeMapper::convertToDTO)
                    .collect(Collectors.toList());
        } else {
            throw new ServiceNotFoundException("Data not Found!!");
        }
        return paymentTypeDTOS;
    }
}

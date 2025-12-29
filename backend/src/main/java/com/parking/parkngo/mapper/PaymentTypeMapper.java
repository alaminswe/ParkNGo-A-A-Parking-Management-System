package com.parking.parkngo.mapper;

import com.parking.parkngo.dto.PaymentTypeDTO;
import com.parking.parkngo.dto.PaymentTypeDTO;
import com.parking.parkngo.entity.PaymentType;
import com.parking.parkngo.entity.PaymentType;

public class PaymentTypeMapper {

    public static PaymentTypeDTO convertToDTO(PaymentType paymentType){
        PaymentTypeDTO paymentTypeDTO = new PaymentTypeDTO();
        paymentTypeDTO.setId(paymentType.getId());
        paymentTypeDTO.setName(paymentType.getName());
        paymentTypeDTO.setCode(paymentType.getCode());
        paymentTypeDTO.setActive(paymentType.getActive());
        return paymentTypeDTO;
    }
}

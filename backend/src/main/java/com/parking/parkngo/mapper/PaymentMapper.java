package com.parking.parkngo.mapper;

import com.parking.parkngo.dto.PaymentDTO;
import com.parking.parkngo.entity.Payment;
import lombok.Data;

@Data
public class PaymentMapper {
    public static PaymentDTO convertToDTO(Payment p) {
        PaymentDTO dto = new PaymentDTO();
        dto.setId(p.getId());
        dto.setBookingId(p.getBooking().getId());
        dto.setAmount(p.getAmount());
        dto.setTransactionId(p.getTransactionId());
        dto.setPaymentMethod(p.getPaymentMethod());
        dto.setPaymentStatus(p.getPaymentStatus());
        dto.setPaidAt(p.getPaidAt() != null ? p.getPaidAt().toString() : null);
        return dto;
    }
}

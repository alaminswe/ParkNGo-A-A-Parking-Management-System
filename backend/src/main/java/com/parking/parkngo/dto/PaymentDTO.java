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
public class PaymentDTO {

    private Integer id;
    private Long bookingId;
    private Double amount;
    private String transactionId;
    private String paymentMethod;
    private String paymentStatus;
    private String paidAt;
}

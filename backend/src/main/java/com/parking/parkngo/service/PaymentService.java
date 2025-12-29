package com.parking.parkngo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.parking.parkngo.repository.PaymentRepository;



@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
}

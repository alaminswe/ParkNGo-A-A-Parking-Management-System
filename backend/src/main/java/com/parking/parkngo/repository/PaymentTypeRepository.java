package com.parking.parkngo.repository;

import com.parking.parkngo.entity.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentTypeRepository extends JpaRepository<PaymentType, Long> {
    //<PaymentType> findByIdAndActive(Long id, boolean b);
}

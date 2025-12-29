package com.parking.parkngo.repository;

import com.parking.parkngo.entity.VehicleType;
import com.parking.parkngo.entity.VehicleType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface VehicleTypeRepository extends JpaRepository<VehicleType,Long> {

    Optional<VehicleType> findByIdAndActive(Long id, boolean b);

    List<VehicleType> findAllByActive(boolean b);


}

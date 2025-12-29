package com.parking.parkngo.repository;

import com.parking.parkngo.entity.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserTypeRepository extends JpaRepository<UserType,Long> {
    Optional<UserType> findByIdAndActive(Long id, boolean b);

    List<UserType> findAllByActive(boolean b);
}
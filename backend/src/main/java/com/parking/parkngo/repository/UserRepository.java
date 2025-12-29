package com.parking.parkngo.repository;


import com.parking.parkngo.entity.Booking;
import com.parking.parkngo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    boolean existsByEmail(String email);

    User findByEmail(String email);
}
package com.parking.parkngo.service;
import com.parking.parkngo.repository.SpotAvailabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpotAvailabilityService {

    @Autowired
    private SpotAvailabilityRepository repository;

}

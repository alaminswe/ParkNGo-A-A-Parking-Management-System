package com.parking.parkngo.controller;

import com.parking.parkngo.service.SpotAvailabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/availability")
public class SpotAvailabilityController {

    @Autowired
    private SpotAvailabilityService service;

}

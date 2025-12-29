package com.parking.parkngo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("Hello, ParkNGo!");
       return "Hello, ParkNGo!";
    }
}

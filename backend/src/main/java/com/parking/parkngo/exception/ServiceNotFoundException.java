package com.parking.parkngo.exception;

public class ServiceNotFoundException extends RuntimeException{
    public ServiceNotFoundException(String message) {
        super(message);
    }
}
package com.parking.parkngo.exception;

public class ServiceBusinessException extends RuntimeException{
    public ServiceBusinessException(String message) {
        super(message);
    }
}
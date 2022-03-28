package com.capgemini.springbootcalculator.exception;

public class InvalidLengthException extends RuntimeException{
    public InvalidLengthException(String message) {
        super(message);
    }
}

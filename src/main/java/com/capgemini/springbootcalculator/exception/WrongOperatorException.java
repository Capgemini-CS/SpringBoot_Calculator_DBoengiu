package com.capgemini.springbootcalculator.exception;

public class WrongOperatorException extends RuntimeException{
    public WrongOperatorException(String message) {
        super(message);
    }
}

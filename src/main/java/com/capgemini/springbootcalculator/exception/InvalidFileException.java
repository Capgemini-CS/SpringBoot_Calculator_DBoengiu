package com.capgemini.springbootcalculator.exception;

public class InvalidFileException extends RuntimeException {
    public InvalidFileException(String message) {
        super(message);

    }
}

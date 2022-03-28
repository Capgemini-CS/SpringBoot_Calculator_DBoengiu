package com.capgemini.springbootcalculator.validation;

public interface DataValidation {
    void checkLength(String[] fileAttributes);
    void checkIfNull(String[] fileAttributes);
}

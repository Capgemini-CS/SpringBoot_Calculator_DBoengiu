package com.capgemini.springbootcalculator.validation;

import com.capgemini.springbootcalculator.exception.InvalidLengthException;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class FileDataValidation implements DataValidation{
    @Override
    public void checkLength(String[] fileAttributes) {
        if (fileAttributes.length != 3) {
            throw new InvalidLengthException("The number of requested parameters was not respected");
        }
    }

    @Override
    public void checkIfNull(String[] fileAttributes) {
        for (String attribute : fileAttributes) {
            if (Objects.isNull(attribute)) {
                throw new NullPointerException("Input was null");
            }
        }
    }
}

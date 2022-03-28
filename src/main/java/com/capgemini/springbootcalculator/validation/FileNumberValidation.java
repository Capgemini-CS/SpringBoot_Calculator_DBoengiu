package com.capgemini.springbootcalculator.validation;

import org.springframework.stereotype.Component;

@Component
public class FileNumberValidation implements NumberValidation{
    @Override
    public void isNotNumeric(String stringToNumber) {
        try {
            Integer.parseInt(stringToNumber);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("You should have entered numbers");
        }

    }
}

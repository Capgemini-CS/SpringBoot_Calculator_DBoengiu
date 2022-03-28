package com.capgemini.springbootcalculator.services.operations;

import org.springframework.stereotype.Service;

@Service
public class SubtractionService implements Operation {
    @Override
    public double execute(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public String whoAmI() {
        return "-";
    }
}

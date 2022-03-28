package com.capgemini.springbootcalculator.services.operations;

import org.springframework.stereotype.Service;

@Service
public class DivisionService implements Operation{
    @Override
    public double execute(double firstNumber, double secondNumber) {
        if (secondNumber ==0) {
            throw new ArithmeticException("You tried to divide by zero");
        }
        return (double) firstNumber / secondNumber;
    }

    @Override
    public String whoAmI() {
        return "/";
    }
}

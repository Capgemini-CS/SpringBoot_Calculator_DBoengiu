package com.capgemini.springbootcalculator.services.operations;

public interface Operation {
    double execute(double firstNumber, double secondNumber);

    String whoAmI();
}

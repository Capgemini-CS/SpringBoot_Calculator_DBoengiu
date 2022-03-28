package com.capgemini.springbootcalculator.services;

import com.capgemini.springbootcalculator.computation.CalculatorCalculation;
import com.capgemini.springbootcalculator.output.CalculatorOutput;
import com.capgemini.springbootcalculator.validation.FileDataValidation;
import com.capgemini.springbootcalculator.validation.FileNumberValidation;
import com.capgemini.springbootcalculator.validation.FileOperatorValidation;
import org.springframework.stereotype.Service;
import org.tinylog.Logger;

@Service
public class CalculatorService implements CalculatorInterface {

    int firstNumber;
    int secondNumber;
    String operator;

    private final FileDataValidation fileDataValidation;
    private final FileOperatorValidation fileOperatorValidation;
    private final FileNumberValidation fileNumberValidation;
    private final CalculatorCalculation calculatorCalculation;
    private final CalculatorOutput calculatorOutput;

    public CalculatorService(FileDataValidation fileDataValidation, FileOperatorValidation fileOperatorValidation, FileNumberValidation fileNumberValidation, CalculatorCalculation calculatorCalculation, CalculatorOutput calculatorOutput) {

        this.fileDataValidation = fileDataValidation;
        this.fileOperatorValidation = fileOperatorValidation;
        this.fileNumberValidation = fileNumberValidation;
        this.calculatorCalculation = calculatorCalculation;
        this.calculatorOutput = calculatorOutput;
    }


    @Override
    public double executeOperation(String... parameters) {


        try {
            fileDataValidation.checkLength(parameters);
            fileDataValidation.checkIfNull(parameters);
            fileOperatorValidation.checkAllowedOperand(parameters[0]);
            fileNumberValidation.isNotNumeric(parameters[1]);
            fileNumberValidation.isNotNumeric(parameters[1]);
        } catch (RuntimeException e) {
            Logger.error(e.getMessage());
        }


        this.firstNumber = Integer.parseInt(parameters[1]);
        this.secondNumber = Integer.parseInt(parameters[2]);
        this.operator = parameters[0];

        double result = 0;


        try {
            result = calculatorCalculation.doCalculation(firstNumber, secondNumber, operator);
        } catch (
                ArithmeticException e) {
            Logger.error("You have tried to divide by zero");
        }


        return calculatorOutput.showResult(result);


    }
}

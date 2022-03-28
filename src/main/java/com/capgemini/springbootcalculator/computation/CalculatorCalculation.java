package com.capgemini.springbootcalculator.computation;

import com.capgemini.springbootcalculator.services.operations.Operation;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CalculatorCalculation implements Calculation {


    private List<Operation> operations;

    public CalculatorCalculation(List<Operation> operations) {
        this.operations = operations;
    }


    @Override
    public double doCalculation(double firstNumber, double secondNumber, String operator) {

        double result = 0;


        for (Operation operation : operations) {

            if (operation.whoAmI().equals(operator)) {
                result = operation.execute(firstNumber, secondNumber);
            }
        }


        return result;
    }
}

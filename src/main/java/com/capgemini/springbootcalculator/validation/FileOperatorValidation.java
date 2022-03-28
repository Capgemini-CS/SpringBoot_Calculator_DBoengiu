package com.capgemini.springbootcalculator.validation;

import com.capgemini.springbootcalculator.exception.WrongOperatorException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FileOperatorValidation implements OperatorValidation{
    @Override
    public void checkAllowedOperand(String operator) {
        List<String> allowedOperands = new ArrayList<>(List.of("+", "-", "*", "/"));
        if (!allowedOperands.contains(operator)) {
            throw new WrongOperatorException("You should enter one of these operands {+, -, *, /}");
        }
    }
}

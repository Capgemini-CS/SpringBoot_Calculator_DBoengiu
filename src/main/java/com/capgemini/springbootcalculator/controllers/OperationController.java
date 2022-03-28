package com.capgemini.springbootcalculator.controllers;

import com.capgemini.springbootcalculator.services.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operation")
public class OperationController {

    private final CalculatorService calculatorService;

    public OperationController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public double doMath(
            @RequestParam String operator,
            @RequestParam String firstNumber,
            @RequestParam String secondNumber
    ) {
        String[] parameters  = {operator, firstNumber, secondNumber};
        return calculatorService.executeOperation(parameters);
    }
}

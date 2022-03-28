package com.capgemini.springbootcalculator.controllers;

import com.capgemini.springbootcalculator.services.CalculatorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.tinylog.Logger;

import java.util.Map;

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
        String[] parameters = {operator, firstNumber, secondNumber};
        return calculatorService.executeOperation(parameters);
    }

    @GetMapping("/listHeaders")
    public ResponseEntity<String> listAllHeaders(@RequestHeader Map<String, String> headers) {
        headers.forEach((key, value) -> {
            Logger.info(String.format("Header '%s' = %s", key, value));
        });

        return new ResponseEntity<String>(
                String.format("Listed %d headers", headers.size()), HttpStatus.OK);
    }
}

package com.capgemini.springbootcalculator.output;

import org.springframework.stereotype.Component;
import org.tinylog.Logger;

@Component
public class CalculatorOutput implements Output{
    @Override
    public double showResult(double result) {
        Logger.info(result);
        return result;
    }
}

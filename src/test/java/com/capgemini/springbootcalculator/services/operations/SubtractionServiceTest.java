package com.capgemini.springbootcalculator.services.operations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionServiceTest {

    SubtractionService subtractionService = new SubtractionService();

    @Test
    void executeSubtraction() {
        assertEquals(-1, subtractionService.execute(1,2));
    }
}
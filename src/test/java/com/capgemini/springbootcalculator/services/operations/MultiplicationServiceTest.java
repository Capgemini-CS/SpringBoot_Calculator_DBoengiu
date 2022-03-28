package com.capgemini.springbootcalculator.services.operations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationServiceTest {

    MultiplicationService multiplicationService = new MultiplicationService();

    @Test
    void executeMultiplication() {
        assertEquals(2, multiplicationService.execute(1,2));
    }
}
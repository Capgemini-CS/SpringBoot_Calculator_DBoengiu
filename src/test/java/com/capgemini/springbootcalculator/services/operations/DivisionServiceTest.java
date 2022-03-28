package com.capgemini.springbootcalculator.services.operations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionServiceTest {

    DivisionService divisionService = new DivisionService();

    @Test
    void executeDivision() {
        assertEquals(0.5, divisionService.execute(1,2));
    }

    @Test
    void divisionThrowsError() {
        assertThrows(ArithmeticException.class, () -> divisionService.execute(1,0));
    }
}
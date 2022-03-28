package com.capgemini.springbootcalculator.services.operations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionServiceTest {

    AdditionService additionService = new AdditionService();

    @Test
    void executeAddition() {
        assertEquals(3, additionService.execute(1,2));
    }
}
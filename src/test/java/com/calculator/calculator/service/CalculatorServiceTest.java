package com.calculator.calculator.service;

import com.calculator.calculator.exceptions.DivisionByZeroExceptions;
import com.calculator.calculator.service.impl.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {

    CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    void plusPositive() {
        int acutal = calculatorService.plus(3, 5);
        assertEquals(8, acutal);

    }

    @Test
    void plusNegative() {
        int acutal = calculatorService.plus(-3, -5);
        assertEquals(-8, acutal);

    }

    @Test
    void minusPositive() {
        int acutal = calculatorService.minus(8, 3);
        assertEquals(5, acutal);

    }

    @Test
    void minusNegative() {
        int acutal = calculatorService.minus(3, -5);
        assertEquals(8, acutal);

    }

    @Test
    void multiplyPositive() {
        int acutal = calculatorService.multiply(8, 3);
        assertEquals(24, acutal);

    }

    @Test
    void multiplyNegative() {
        int acutal = calculatorService.multiply(3, -5);
        assertEquals(-15, acutal);

    }

    @Test
    void dividePositive() throws DivisionByZeroExceptions, Exception {
        int acutal = calculatorService.divide(8, 3);
        assertEquals(2, acutal);

    }

    @Test
    void divideNegative() throws DivisionByZeroExceptions, Exception {
        int acutal = calculatorService.divide(-10, 2);
        assertEquals(-5, acutal);

    }

    @Test
    void divisionByZero() {
        assertThrows(DivisionByZeroExceptions.class, () -> calculatorService.divide(10, 0));
    }
}

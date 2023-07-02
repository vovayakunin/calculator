package com.calculator.calculator.service;

import com.calculator.calculator.exceptions.DivisionByZeroExceptions;
import com.calculator.calculator.service.impl.CalculatorServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ParametrizedCalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorServiceImpl();
    private int n1;
    private int n2;
    private int expected;

    static Stream<Arguments> dataForPlus() {
        return Stream.of(
                Arguments.of(3, 5, 8),
                Arguments.of(201, 38, 239),
                Arguments.of(-111, 11, 100),
                Arguments.of(-111, -11, -122)
        );

    }

    @ParameterizedTest
    @MethodSource("dataForPlus")
    void plus(int n1, int n2, int expected) {
        assertEquals(expected,
                calculatorService.plus(n1, n2));

    }

    private void assertEquals(int expected, int plus) {
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(3, 5),
                Arguments.of(201, 38),
                Arguments.of(-111, 11),
                Arguments.of(-111, -11)
        );

    }

    @ParameterizedTest
    @MethodSource("data")
    void minus(int n1, int n2) {
        int expected = n1 - n2;
        assertEquals(expected, calculatorService.minus(n1, n2));

    }

    @ParameterizedTest
    @MethodSource("data")
    void multiply(int n1, int n2) {
        int expected = n1 * n2;
        assertEquals(expected, calculatorService.multiply(n1, n2));

    }

    @ParameterizedTest
    @MethodSource("data")
    void divide(int n1, int n2) throws DivisionByZeroExceptions, Exception {
        int expected = n1 / n2;
        assertEquals(expected, calculatorService.divide(n1, n2));

    }
}

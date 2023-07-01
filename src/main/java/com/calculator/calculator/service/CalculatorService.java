package com.calculator.calculator.service;

import com.calculator.calculator.exceptions.DivisionByZeroExceptions;

public interface CalculatorService {
    int plus(int a, int b);

    int minus(int a, int b);


    int multiply(int a, int b);


    int divide(int a, int b) throws Exception, DivisionByZeroExceptions;
}



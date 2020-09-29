package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract(){
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        int sumResult = calculator.subtract(a, b);
        assertEquals(5, sumResult);
    }

    @Test
    public void testToSecondPowerBelowZeroValue(){
        Calculator calculator = new Calculator();
        int a = -1;
        double sumResult = calculator.toSecondPower(a);
        assertEquals(1,sumResult);
    }

    @Test
    public void testToSecondPowerValueZero(){
        Calculator calculator = new Calculator();
        int a = 0;
        double sumResult = calculator.toSecondPower(a);
        assertEquals(0,sumResult);
    }

    @Test
    public void testToSecondPowerValueUpperZero(){
        Calculator calculator = new Calculator();
        int a = 1;
        double sumResult = calculator.toSecondPower(a);
        assertEquals(1,sumResult);
    }
}

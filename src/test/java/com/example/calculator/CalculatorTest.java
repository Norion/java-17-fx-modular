package com.example.calculator;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator c = null;

    @BeforeEach
    public void before () {
        this.c = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals (c.add(3.4,2.3), 5.7, 0.01);
    }

    @Test
    public void testSubtract() {
        assertEquals (c.subtract(3.4,2.3), 1.1, 0.01);
    }

    @Test
    public void testMultiply() {
        assertEquals (c.multiply(4.0,4.0), 16, 0.01);
    }
    @Test
    public void testDivide() {
        assertEquals (c.divide(16,4), 4, 0.01);
    }

}
package com.ust.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc;

    @BeforeEach
    void setUp(){
        calc = new Calculator();
    }

    @AfterEach
    void tearDown(){
        calc = null;
    }

    @Test
    void testAdd(){
        int a = 10;
        int b = 20;
        assertEquals(30, calc.add(a,b));
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    // Helo to run on Particular os
    void testMultiply(){
        int a = 10;
        int b = 20;
        assertEquals(200, calc.multiply(a,b));
    }

    @Test
    void testDivide(){
        assertEquals(10,calc.divide(100,10));
        assertThrows(ArithmeticException.class, ()->calc.divide(10,0));

    }



}
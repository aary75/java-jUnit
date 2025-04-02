package com.bridgelabz.testing;

import com.bridgelabz.javaJunit.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    // testing of addition method
    @Test
    public void additionTest(){
        int result = Calculator.addition(12,45);
        int expected = 57;

        Assert.assertEquals(expected, result);
    }

    @Test
    public void subtractionTest(){
        int result = Calculator.subtraction(45,10);
        int expected = 35;

        Assert.assertEquals(expected, result);
    }

    @Test
    public void multiplicationTest(){
        int result = Calculator.multiplication(2,3);
        int expected = 6;

        Assert.assertEquals(expected, result);
    }

    @Test
    public void divisionTest(){
        String result = Calculator.division(4,2);
        String expected = String.valueOf(2);

        Assert.assertEquals(expected, result);
    }
}

//in case if data types are different, outcome will be
//java.lang.AssertionError: expected: java.lang.Integer<2> but was: java.lang.String<2>
//Expected :java.lang.Integer<2>
//Actual   :java.lang.String<2>

//here this is happens in multiplication
//if expected and result does not match
//java.lang.AssertionError:
//Expected :3
//Actual   :6
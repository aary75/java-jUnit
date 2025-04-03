package com.bridgelabz.testing;

import com.bridgelabz.javaJunit.TemperatureChange;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureChangeTest {

    @Test
    public void changeToFarheinheit(){
        double result = TemperatureChange.celciusToFarhenheit(32);
        double expected = 89.6;

        Assertions.assertEquals(result, expected);
    }

    @Test
    public void changeToCelcius(){
        double result = TemperatureChange.farhenheitToCelcius(60);
        double expected = 15.555555555555557;

        Assertions.assertEquals(result,expected);
    }
}

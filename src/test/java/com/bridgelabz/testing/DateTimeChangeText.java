package com.bridgelabz.testing;

import com.bridgelabz.javaJunit.DateTimeChange;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class DateTimeChangeText {

    @Test
    public void DateTimeChange(){
        String result = DateTimeChange.DateTimeFormatting("2024-03-21");
        String expected = "21-03-2024";

        Assertions.assertEquals(result,expected);

    }

    @Test
    public void DateTimeChange1(){
        String result = DateTimeChange.DateTimeFormatting("2024-03-21");
        String expected = "28-03-2024";

        Assertions.assertEquals(result,expected);

    }

}

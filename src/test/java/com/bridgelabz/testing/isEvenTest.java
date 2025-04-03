package com.bridgelabz.testing;

import com.bridgelabz.javaJunit.isEven;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class isEvenTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    public void isEven(int number){
        Assertions.assertTrue(isEven.isEven(number));
    }
}

//for odd number
//
//org.opentest4j.AssertionFailedError:
//Expected :true
//Actual   :false


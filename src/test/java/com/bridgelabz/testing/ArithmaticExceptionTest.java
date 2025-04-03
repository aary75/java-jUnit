package com.bridgelabz.testing;

import com.bridgelabz.javaJunit.ArithmaticException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmaticExceptionTest {

     @Test
    void textException(){
         Assertions.assertThrows(ArithmeticException.class,()
         -> ArithmaticException.divide(4,0));
     }
}

package com.bridgelabz.testing;

import com.bridgelabz.javaJunit.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void Validation(){
        boolean result = UserRegistration.register("Aaryancew","ryn@gmail.com","Aaryan2n");
        boolean expected = true;
        Assertions.assertEquals(result,expected);
    }

    @Test
    public void invalid(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> UserRegistration.register("Aaryan","ryan@gmail.com","Aercecews"));

    }
}

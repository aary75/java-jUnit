package com.bridgelabz.testing;

import com.bridgelabz.javaJunit.PasswordStrengthValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

public class PasswordStrengthValidatorTest {

    @Test
    public void passwordChecking(){
        String regex = "(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,}";
        String result = PasswordStrengthValidator.checking("Aary3cec", Pattern.compile(regex));

        String expected = "Valid";
        Assertions.assertEquals(result, expected);
    }
}

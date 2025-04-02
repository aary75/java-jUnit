package com.bridgelabz.javaJunit;

import java.util.*;

public class Calculator {
    public static int addition(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public static int subtraction(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public static int multiplication(int firstNumber, int secondNumber){
        return firstNumber*secondNumber;
    }

    public static String  division(int firstNumber, int secondNumber){
        try {
            int result = firstNumber/secondNumber;
            return String.valueOf(result);
        }
        catch (ArithmeticException e){
            return e.getMessage();
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println("Addition of first and second number is: " + addition(firstNumber,secondNumber));
        System.out.println("Subtraction of first and second number is: " + subtraction(firstNumber, secondNumber));
        System.out.println("Multiplication of first and second number is: " + multiplication(firstNumber, secondNumber));
        System.out.println("Division of first and second number is: " + division(firstNumber, secondNumber));
    }
}


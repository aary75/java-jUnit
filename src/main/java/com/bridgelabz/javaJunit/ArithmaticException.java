package com.bridgelabz.javaJunit;

import java.util.Scanner;

public class ArithmaticException {
    public static String divide(int numerator, int denominator){
        try{

            int result = numerator / denominator;
            return String.valueOf(result);
        }
        catch(ArithmeticException e){;
            throw new ArithmeticException();
        }

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Denominator: ");
        int denominator = scanner.nextInt();

        System.out.println("Output of division is: " + divide(numerator,denominator));

    }
}

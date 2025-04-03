package com.bridgelabz.javaJunit;
import java.util.Scanner;

public class isEven {
    public static boolean isEven(int number){
        boolean isEven = false;

        if(number%2 == 0) isEven = true;
        return isEven;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if(isEven(number)){
            System.out.print(number + " is an even number.");
        }
        else{
            System.out.print(number + " is not an even number.");
        }
    }
}

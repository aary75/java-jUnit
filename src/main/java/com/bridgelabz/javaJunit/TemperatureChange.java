package com.bridgelabz.javaJunit;

import java.util.Scanner;

public class TemperatureChange {
    public static double celciusToFarhenheit(int celcius){

        double farhenheit = ((9.0/5)*celcius) + 32;

        return farhenheit;
    }

    public static double farhenheitToCelcius(int farhenheit){

        double celcius = (farhenheit - 32) *(5.0/9);

        return celcius;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperature in celcius: ");
        int celcius = scanner.nextInt();
        System.out.println("Temperature in Farhenheit after changing: "+ celciusToFarhenheit(celcius));

        System.out.print("Temperature in farhenheit: ");
        int farhenheit = scanner.nextInt();
        System.out.print("Temperature in celcius after changing: " + farhenheitToCelcius(farhenheit));
    }
}

//Temperature in celcius: 32
//Temperature in Farhenheit after changing: 89.6
//Temperature in farhenheit: 58
//Temperature in celcius after changing: 14.444444444444445
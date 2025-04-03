package com.bridgelabz.javaJunit;

public class TimeOutFunction {
    public static void longRunningTask(){
        System.out.print("This method is taking 3 seconds to run.");
    }
    public static void main(String[] args){

        longRunningTask();
    }
}

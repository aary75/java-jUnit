package com.bridgelabz.javaJunit;

import java.util.*;

public class StringUtils {
    public static String reverse(String str){
        String reverseStr  = "";

        for(int i = str.length()-1;i>=0;i--){
            reverseStr += str.charAt(i);
        }

        return reverseStr;
    }

    public static boolean isPalindrome(String str){
        boolean istrue = true;

        int start = 0;
        int end = str.length()-1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                istrue = false;
            }
            start++;
            end--;
        }

        return istrue;
    }

    public static String toUpperCase(String str){
        return str.toUpperCase();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Required String: ");
        String str = scanner.nextLine();

        System.out.println("Reversed String: " + reverse(str));

        if(isPalindrome(str)) System.out.println(str + " is a palindromic string");
        else System.out.println(str + " is not a palindromic string");

        System.out.print("Uppercase of string: " + toUpperCase(str));

    }
}

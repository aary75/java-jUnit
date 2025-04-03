package com.bridgelabz.javaJunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordStrengthValidator {
    public static String checking(String input, Pattern pattern){

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println("Matched: "+ matcher.group());
        }

        return "Valid";
    }
    public static void main(String[] args){

        String regex = "(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,}";

        Pattern pattern = Pattern.compile(regex);

        String input = "Aarya8ne";

        System.out.print(checking(input, pattern));
//        Matcher matcher = pattern.matcher(input);
//
//        while(matcher.find()){
//            System.out.print("Matched: "+matcher.group());
//        }

    }
}

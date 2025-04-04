package com.bridgelabz.javaJunit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean register(String userName, String userEmail, String userPassword) throws IllegalArgumentException{
            String userNameRegex = "[A-Za-z]+(\\s[A-Za-z]+)*";
            Pattern patternName = Pattern.compile(userNameRegex);
            Matcher userMatcher = patternName.matcher(userName);
            boolean isValidName = userMatcher.matches();

            String userEmailRegex = "[A-Za-z0-9]+@[A-Za-z]+\\.[A-Za-z]{3}";
            Pattern patternEmail = Pattern.compile(userEmailRegex);
            Matcher emailMatcher = patternEmail.matcher(userEmail);
            boolean isValidEmail = emailMatcher.matches();

            String userPasswordRegex = "(?=.*[A-Z]+)(?=.*\\d+)[A-Za-z0-9]{8,}";
            Pattern patternPassword = Pattern.compile(userPasswordRegex);
            Matcher passwordMatcher = patternPassword.matcher(userPassword);
            boolean isValidPassword = passwordMatcher.matches();

            if(!isValidPassword || !isValidName || !isValidEmail){
                throw new IllegalArgumentException();
            }

            return isValidName && isValidEmail && isValidPassword;

        }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String userEmail = scanner.nextLine();
        String userPassword = scanner.nextLine();

        System.out.print(register(userName, userEmail, userPassword));
    }
}

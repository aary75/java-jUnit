package com.bridgelabz.javaJunit;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateTimeChange {
    public static String DateTimeFormatting(String str){
        LocalDate date1 = LocalDate.parse(str);

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-YYYY");
       // System.out.print(date1.format(format1));
        return date1.format(format1);
    }
    public static void main(String[] args){
        System.out.print("Changing the date format ");
        System.out.print(DateTimeFormatting("2025-04-05"));
    }


}

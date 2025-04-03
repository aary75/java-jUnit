package com.bridgelabz.javaJunit;

import java.io.*;

public class FileHandling {
    public static boolean isReadAndWriteCorrect() throws IOException{

        BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\aarya\\Downloads\\Aaryan Resume.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("output.txt"));

        String line1 = reader1.readLine();
        String line2 = reader2.readLine();

        int lineNum = 1;
        boolean areEqual = true;
        while(line1 != null || line2 != null){
            if(line1 == null || line2 == null){
                areEqual = false;
                break;
            } else if(!line1.equalsIgnoreCase(line2)){
                areEqual = false;
                break;
            }

            line1 = reader1.readLine();
            line2 = reader2.readLine();
            lineNum++;
        }

        if(areEqual){
            return areEqual;
        }

        return false;
    }

    public static String stream() throws IOException{
        try {

            FileInputStream fis = new FileInputStream("C:\\Users\\aarya\\Downloads\\Aaryan Resume.txt");
            FileOutputStream fos = new FileOutputStream("output.txt");

            int byteCode;
            while((byteCode = fis.read()) != -1){
                fos.write((char) byteCode);
            }

            return "File imported Successfully";
        }
        catch(IOException e){
            throw new IOException();
        }
    }
    public static void main(String[] args) throws IOException{

      stream();
    }
}

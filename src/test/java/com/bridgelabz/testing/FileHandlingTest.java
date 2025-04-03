package com.bridgelabz.testing;

import com.bridgelabz.javaJunit.FileHandling;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandlingTest {

   @Test
   public void matching() throws IOException{
       Assertions.assertTrue(FileHandling.isReadAndWriteCorrect());
   }


    @Test
    public void checking(){
    Path path = Paths.get("output.txt");
    Assertions.assertTrue(Files.exists(path));
    }

    // if file existed then it will throw error
    @Test
    public void ifFileNotExist() throws IOException {
        Assertions.assertThrows(IOException.class,()->{
            FileHandling.stream();
        });
    }
}


//org.opentest4j.AssertionFailedError: Expected java.io.IOException to be thrown, but nothing was thrown.
//
//at org.junit.jupiter.api.AssertionFailureBuilder.build(AssertionFailureBuilder.java:152)
//at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:73)
//at org.junit.jupiter.api.AssertThrows.assertThrows(AssertThrows.java:35)
//at org.junit.jupiter.api.Assertions.assertThrows(Assertions.java:3128)
//at com.bridgelabz.testing.FileHandlingTest.ifFileNotExist(FileHandlingTest.java:28)
//at java.base/java.lang.reflect.Method.invoke(Method.java:580)
//at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
//at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
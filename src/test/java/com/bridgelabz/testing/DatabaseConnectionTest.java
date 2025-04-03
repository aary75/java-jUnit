package com.bridgelabz.testing;

import com.bridgelabz.javaJunit.DatabaseConnection;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DatabaseConnectionTest {

    @BeforeEach
    public void connected(){
        DatabaseConnection.connect();
    }

    @Test
    @Order(1)
    public void test(){
        Assertions.assertTrue(DatabaseConnection.isConnected());
    }

    @Test
    @Order(2)
    public void testing(){
        Assertions.assertTrue(DatabaseConnection.isConnected());
    }

    @AfterEach
    public void disconnected(){

        DatabaseConnection.disconnect();
        System.out.println();
    }
}

//Database connected
//Database disconnected
//
//Database connected
//Database disconnected
package com.bridgelabz.javaJunit;

public class DatabaseConnection {
    static boolean connected = false;

    public static void connect(){
        System.out.println("Database connected");
        connected = true;
    }

    public static void disconnect(){
        System.out.println("Database disconnected");
        connected = false;
    }

    public static boolean isConnected(){
        return connected;
    }

    public static void main(String[] args){

        connect();
        disconnect();
    }
}

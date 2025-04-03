package com.bridgelabz.javaJunit;

public class BankAccountTransactions {


        public static int initialAmount = 0;

        public static int deposit(int amount){
            initialAmount += amount;
            return initialAmount;
        }

       public static int withdraw(int amount){
            if(initialAmount <= amount){
                System.out.print("Cannot withdraw");
                return 0;
            }
             initialAmount -= amount;
            return initialAmount;
        }

       public static int getBalance(){
            return initialAmount;
        }

    public static void main(String[] args){

        deposit(10000);
        withdraw(15000);
        System.out.print("Current Balance in account is "+getBalance());
    }
}

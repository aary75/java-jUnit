package com.bridgelabz.testing;

import com.bridgelabz.javaJunit.BankAccountTransactions;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BankAccountTransactionsTest {

      @BeforeAll
      public static void initial(){
          BankAccountTransactions.initialAmount = 0;
      }
      @Test
      @Order(1)
      public void checkingDeposit(){
          int result = BankAccountTransactions.deposit(10000);
          int expected = 10000;
          Assertions.assertEquals(result, expected);
      }

      @Test
      @Order(2)
      public void checkingWithdraw(){
       //   BankAccountTransactions.deposit(10000);
          int result = BankAccountTransactions.withdraw(3000);
          int expected = 7000;
          Assertions.assertEquals(expected, result);
      }

      @Test
      @Order(3)
      public void checkingGetBalance(){
        //  BankAccountTransactions.deposit(5000);
          int result = BankAccountTransactions.getBalance();
          int expected = 7000;
          Assertions.assertEquals(result, expected);
      }
}

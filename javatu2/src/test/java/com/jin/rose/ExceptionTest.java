package com.jin.rose;

import com.jin.rose.Checkings.CheckingsAccount;
import com.jin.rose.Checkings.InsufficientFundsException;


public class ExceptionTest {
    public static void main(String[] args) {
        try {
            CheckingsAccount test = new CheckingsAccount(101);
            test.deposit(300);
            //create user error
            test.withdraw(400);
            //catch user error with user exception
        } catch (InsufficientFundsException e) {
            System.out.println("Sorry, but you are short $" + e.getDifference());
            e.printStackTrace();
        }
    }


}

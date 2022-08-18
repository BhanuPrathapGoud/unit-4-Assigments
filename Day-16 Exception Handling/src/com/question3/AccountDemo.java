package com.question3;

public class AccountDemo {
    public static void main(String[] args){
        Account account = new Account("1234569");
        account.deposit(250);
        try {
            account.withdraw(251);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

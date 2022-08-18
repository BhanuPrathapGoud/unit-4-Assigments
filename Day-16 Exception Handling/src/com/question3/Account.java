package com.question3;

public class Account {

    String accountNumber;
    double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(int amount){
        this.balance = amount;
    }
    public double withdraw(int amount) throws InsufficientFundsException{
        if(amount > balance){
            throw   new InsufficientFundsException("Insufficient Balance");
        }else{
            System.out.println("Withdraw Successfully");
        }
        return amount;
    }
}

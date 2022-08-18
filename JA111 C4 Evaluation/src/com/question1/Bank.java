package com.question1;

public class Bank {
    String branchName;
    String ifscCode;

    public Bank(String branchName, String ifscCode) {
        this.branchName = branchName;
        this.ifscCode = ifscCode;
    }

    public void displayDetails(){
        System.out.println(branchName);
        System.out.println(ifscCode);
    }
}


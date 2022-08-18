package com.question1;

class AxisBank extends Bank {
    double rateOfInterest;

    public AxisBank(String branchName, String ifscCode, double rateOfInterest) {
        super(branchName, ifscCode);
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public void displayDetails() {
        System.out.println(branchName);
        System.out.println(ifscCode);
    }

    public void getCreditCard() {
        System.out.println("Get the Credit Card from the Axis bank");
    }
}

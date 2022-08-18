package com.question1;

class ICICIBank extends Bank {
    double rateOfInterest;

    public ICICIBank(String branchName, String ifscCode, double rateOfInterest) {
        super(branchName, ifscCode);
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public void displayDetails() {
        System.out.println(branchName);
        System.out.println(ifscCode);
        System.out.println(rateOfInterest);
    }
}

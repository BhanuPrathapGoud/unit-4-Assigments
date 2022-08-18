package com.question1;

public class Main {
    public static void main(String[] args) {
        Loan l1 = Loan.getobject();
        Loan l2 = Loan.getobject();
        double permanentEmployeeLoan=l1.calculateLoanAmount(new PermanentEmployee(1,"Name1",1000));
        double temporaryEmployeeLoan=l2.calculateLoanAmount(new TemporaryEmployee(2,"Name2",20,100));
        System.out.println("Loan Amount for Permanent Employee => "+permanentEmployeeLoan);
        System.out.println("Loan Amount for Temporary Employee => "+temporaryEmployeeLoan);
    }
}

package com.question1;

public class Loan {
    public double calculateLoanAmount(Employee employeeObj){
        double loan;
        if(employeeObj instanceof PermanentEmployee){
            loan = (employeeObj.getSalary() / 100) * 15;
        }else{
            loan = (employeeObj.getSalary() / 100) * 10;
        }
        return loan;
    }
    private Loan(){

    }
    public static Loan getobject(){
        return new Loan();
    }

}

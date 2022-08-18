package com.question1;

import java.util.Scanner;

public class Main {
    public static Bank getBank(String bank){
        if(bank.equals("axis")){
            return new AxisBank("Hyderabad","AXIS1234",18.5);
        } else if (bank.equals("icici") ){
            return new ICICIBank("Warangal","ICICI420",42.0);
        }else{
            return null;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Bank Name");
        String bank = scanner.next();


        Bank bankName = getBank(bank);
        System.out.println(bank.equals("axis") );
        if(bankName instanceof AxisBank){
            bankName.displayDetails();
            ((AxisBank) bankName).getCreditCard();
        }else if (bankName instanceof  ICICIBank){
            bankName.displayDetails();
        }else{
            System.out.println("Wrong Input");
        }

   }

}

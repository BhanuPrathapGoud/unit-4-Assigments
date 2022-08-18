package com.question4;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an integer:");
            String number = scanner.next();
            int num = Integer.parseInt(number);
            System.out.println("The square value is : " + Math.pow(num,2));
            System.out.println("The work has been done successfully");

        } catch (Exception e) {
            System.out.println("Entered input is not a valid format for an integer");
        }
    }
}

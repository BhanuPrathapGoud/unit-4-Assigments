package com.question3;

import java.util.Scanner;

public class Demo {
    public  void showDetails(Month month){
        month.showDetails();
    }

    public static void main(String[] args) {
        System.out.println("Enter Month");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        name = name.toUpperCase();
        Demo d1 = new Demo();

        try {
            d1.showDetails(Month.valueOf(name));
        }catch (IllegalArgumentException e){
            System.out.println("Invalid Month Name");
        }

    }
}

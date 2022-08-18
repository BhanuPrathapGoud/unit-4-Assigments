package com.question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total no.of employees:");
        int numberOfEmployees = scanner.nextInt();
        if(numberOfEmployees > 1){
            System.out.println("Enter the age for 3 employees:");
            int sum = 0;
            for(int i = 0 ; i < numberOfEmployees ; i++){
                sum+= scanner.nextInt();
            }
            double avg = sum/numberOfEmployees;
            System.out.println("The average age is "+avg);
        }else{
            System.out.println("Please enter a valid employee count");
        }

    }
}

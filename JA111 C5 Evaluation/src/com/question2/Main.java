package com.question2;

import com.question1.Loan;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Date of Birth in format of dd-MM-yyyy");
        String dob = scanner.next();
        try{
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate birth = LocalDate.parse(dob,dtf);
            LocalDate current = LocalDate.now();
            Period diff = Period.between(birth,current);

            if(diff.getYears() >= 18){

                if (diff.getMonths() == 0 && diff.getDays() == 0){
                    System.out.println("Happy Birthday, You are eligible to cast your vote");
                }else{
                    System.out.println("You are eligible to cast your vote");
                }
            }else {
                System.out.println("Date of birth should not be in future");

            }
        }catch (Exception e){
            System.out.println("please pass the date in the proper format");
        }

 }
}

package com.question2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws InvalidDateFormat {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date of birth  dd-MM-yyyy");
        String dob = scanner.next();
        try {
            AgeCalculator ageCalculator = new AgeCalculator();
            System.out.println(ageCalculator.check(dob));
        }catch (InvalidDateFormat e){
            System.out.println(e.getMessage());
        }

    }

}

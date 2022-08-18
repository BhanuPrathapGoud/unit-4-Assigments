package com.question3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("“Enter Start Date  dd-MM-yyyy”");
        String startDate = scanner.next();
        System.out.println("“Enter Start Date  dd-MM-yyyy”");
        String endDate = scanner.next();
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate start = LocalDate.parse(startDate,dtf);
            LocalDate end = LocalDate.parse(endDate,dtf);
            if(ChronoUnit.DAYS.between(start, end)<0){
                System.out.println("Start date should be smaller than End date");
            }else {
                System.out.println("total wages : "+ChronoUnit.DAYS.between(start, end)*1200);
            }
        } catch (Exception e) {
            System.out.println("Please enter date in dd-MM-yyyy” format");
        }
    }

}

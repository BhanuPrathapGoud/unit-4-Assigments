package com.question1;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;



public class EmployeeBonus {
   public double bonus(String date) throws InvalidAge {
       try {
           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
           LocalDate ld = LocalDate.now();
           LocalDate joining = LocalDate.parse(date,dtf);
           Period diff = Period.between(joining,ld);
           if(ChronoUnit.DAYS.between(joining,ld) < 0){
               throw new InvalidAge("Age should not be in the future");
           }else {
               if(diff.getYears() < 1){
                   return 5000;
               } else if (diff.getYears() >= 1 && diff.getYears() < 2) {
                   return 8000;
               }else {
                   return 10000;
               }
           }
       } catch (Exception e) {
           throw new InvalidAge("Please pass the date in the correct format");
       }
   }
}

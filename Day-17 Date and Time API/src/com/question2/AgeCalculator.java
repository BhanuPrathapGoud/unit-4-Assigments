package com.question2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AgeCalculator {
    public String check(String dob ) throws InvalidDateFormat {
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate birthDate = LocalDate.parse(dob,dtf);
            LocalDate ld = LocalDate.now();
            Period diff = Period.between(birthDate , ld);
            if(ChronoUnit.DAYS.between(birthDate, ld)<0){
                return  "Date should not be in Future";
            }else {
                return ("Age of User "+ diff.getYears() +" Years " + diff.getMonths()+" months "  + diff.getDays()+" days");
            }
        }catch (Exception e){
            throw new InvalidDateFormat("Please enter date in dd-MM-yyyy” format");
        }
    }
}

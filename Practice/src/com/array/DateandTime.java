package com.array;

import java.time.LocalDate;
import java.time.Period;

public class DateandTime {
    public static void main(String[] args) {
        //        LocalDate ld = LocalDate.now();
//        System.out.println(ld);
//        LocalTime lt = LocalTime.now();
//        System.out.println(lt);
//        LocalDateTime lid = LocalDateTime.now();
//        System.out.println(lid);
//        LocalDate lD = LocalDate.of(1999,11,18);
//        System.out.println(lD);
//        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");========formeter
//        LocalDateTime current = LocalDateTime.now();
//        System.out.println("current date and time in default format: "+ current);
//        String udf= current.format(formatObj);-------------------
//        System.out.println("current date and time in userdefined format: "+ udf);
//        String dob="05/02/1985";
//        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate ld=LocalDate.parse(dob,dtf);
//        System.out.println(ld);
//        diiferent between------------------
        LocalDate cdate = LocalDate.now();
        LocalDate dob = LocalDate.of(1999, 11, 18);
        Period diff = Period.between( dob,cdate);
        System.out.println(diff.getYears());
    }
}

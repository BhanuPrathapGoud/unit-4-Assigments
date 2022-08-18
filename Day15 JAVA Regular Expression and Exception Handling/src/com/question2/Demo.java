package com.question2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

    public boolean validate(String name, String mobileNum, String aadharCard){
        String sampleNamePattern = "^[A-Za-z]\\w{3,8}$";
        String sampleMobileNumPattern = "[6789]{1}[0-9]{9}";
        String sampleAadharNumberPattern = "[0-9]{12}";

        Pattern namePattern = Pattern.compile(sampleNamePattern);
        Pattern mobileNumberPattern = Pattern.compile(sampleMobileNumPattern);
        Pattern aadharNumberPattern = Pattern.compile(sampleAadharNumberPattern);

        Matcher nameMatcher = namePattern.matcher(name);
        Matcher mobileMatcher = mobileNumberPattern.matcher(mobileNum);
        Matcher aadharMatcher = aadharNumberPattern.matcher(aadharCard);

        return  (nameMatcher.matches() && mobileMatcher.matches() && aadharMatcher.matches());

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Aadhar Name");
        String name = scanner.next();
        System.out.println("Enter Aadhar Mobile Number");
        String mobileNumber = scanner.next();
        System.out.println("Enter Aadhar Number");
        String aadharNumber = scanner.next();
        Demo d1 = new Demo();
        boolean test = d1.validate(name,mobileNumber, aadharNumber);
        if(test){
            Citizen citizen = new Citizen(name,mobileNumber, aadharNumber);
            System.out.println(citizen.toString());

        }else{
            System.out.println("Wrong credential");
        }
    }

}

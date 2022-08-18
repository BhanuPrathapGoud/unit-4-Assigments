package com.question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Your Join Date");
            String joining = scanner.next();
            EmployeeBonus employeeBonus = new EmployeeBonus();
            double bonus = employeeBonus.bonus(joining);
            System.out.println(bonus);
        } catch (InvalidAge e) {
            System.out.println(e.getMessage());
        }
    }
}
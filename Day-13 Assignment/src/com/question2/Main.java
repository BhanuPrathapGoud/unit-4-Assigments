package com.question2;

import java.util.Scanner;

public class Main {
    public static Employee getEmployeeDetails(){
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employ ID");
        employee.setEmployeeId(scanner.nextInt());
        System.out.println("Enter Employ Name");
        employee.setEmployeeName(scanner.next());
        System.out.println("Enter Employ Salary");
        employee.setSalary(scanner.nextInt());

        return employee;
    }
    public static int getPFPercentage(){
        System.out.println("Enter PF percentage");
        Scanner scanner = new Scanner(System.in);
       return  scanner.nextInt();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Employee emp = getEmployeeDetails();
       emp.calculateNetSalary( getPFPercentage());
        System.out.println("Employ ID: "+emp.getEmployeeId());
        System.out.println("Employ Name: "+emp.getEmployeeName());
        System.out.println("Employ Salary: "+emp.getSalary());
        System.out.println("Employ Net Salary: "+emp.getNetSalary());
    }
}

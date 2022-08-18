package com.question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Students you want to enter");
        int numberOfInputs = scanner.nextInt() ;
        System.out.println("==========================");
        for(int i = 1 ; i <= numberOfInputs ; i++ ) {
            System.out.println("Enter the Roll Number :");
            int rollNumber = scanner.nextInt();
            System.out.println("Enter the Name :");
            String name = scanner.next();
            System.out.println("Enter the marks :");
            int marks = scanner.nextInt();
            Student student = new Student(rollNumber,name,marks);
            System.out.println("Student Detail "+i);
            System.out.println("Student Roll "+student.rollNumber);
            System.out.println("Student Name "+student.studentName);
            System.out.println("Student Marks "+ student.marks);
            System.out.println("==========================");
        }
    }
}

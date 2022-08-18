package com.question3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Student objects need to be created.");
        int noOfInputs = scanner.nextInt();
        int avgMarks = 0;
        Student [] array = new Student[noOfInputs];
        for(int i = 0 ; i < noOfInputs ; i++ ){
            System.out.println("Enter Student"+(i+1)+" Name");
            String name = scanner.next();
            System.out.println("Enter Student Roll Number");
            int roll = scanner.nextInt();
            System.out.println("Enter Student Marks");
            int marks = scanner.nextInt();
            avgMarks += marks;
            System.out.println("Enter Student Address");
            String address = scanner.next();
           Student student = new Student(roll,name,address,marks);
            array[i] = student;
            System.out.println("Student"+(i+1)+ "Details");
        }
        for (Student ele: array ) {
            System.out.println("Student Roll.No: "+ele.roll);
            System.out.println("Student Name: "+ele.name);
            System.out.println("Student Address: "+ele.address);
            System.out.println("Student Marks: "+ele.marks);
        }
        System.out.println("Average Marks : " + Math.floor(avgMarks/noOfInputs));


    }
}

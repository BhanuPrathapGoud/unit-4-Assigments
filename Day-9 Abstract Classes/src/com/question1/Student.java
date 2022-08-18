package com.question1;

import java.util.Scanner;

public class Student {

    private int roll;
    private String name;
    private int marks;
    private char grade;



    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public Student() {

    }


    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", grade=" + grade +
                '}';
    }

    public void displayDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Roll Number");
        int roll = scanner.nextInt();
        setRoll(roll);
        System.out.println("Enter Student Name");
        String name = scanner.next();
        setName(name);
        System.out.println("Enter Student Marks");
        int marks = scanner.nextInt();
        setMarks(marks);
        this.grade = calculateGrade();
        System.out.println(toString());
    }
    private char calculateGrade(){

        if(marks >= 500){
            return 'A';
        }
        else if (marks < 500 && marks >= 400  ) {
            return 'B';
        }else{
            return 'C';
        }

    }

}

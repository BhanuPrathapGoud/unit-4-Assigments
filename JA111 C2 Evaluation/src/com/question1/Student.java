package com.question1;

public class Student {
    int rollNumber;
    String studentName;
    int marks;
    Student(){
        this.rollNumber = 23;
        this.studentName = "Bhanu";
        this.marks = 600;
    }
    Student(int rollNumber,String studentName,int marks){
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.marks = marks;
    }

}

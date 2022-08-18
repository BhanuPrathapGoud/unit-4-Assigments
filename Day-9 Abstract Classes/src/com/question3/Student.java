package com.question3;

public class Student extends Person{
    int studentId;
    String courseEnrolled;
    int courseFee;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", courseEnrolled='" + courseEnrolled + '\'' +
                ", courseFee=" + courseFee +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Student(String name, String address, String gender, int studentId, String courseEnrolled, int courseFee) {
        super(name, address, gender);
        this.studentId = studentId;
        this.courseEnrolled = courseEnrolled;
        this.courseFee = courseFee;
    }
}

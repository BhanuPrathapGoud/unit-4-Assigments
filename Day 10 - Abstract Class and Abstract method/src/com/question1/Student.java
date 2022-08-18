package com.question1;

public abstract class Student {
    String name;
    String address;
    public abstract void getPercentage();

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

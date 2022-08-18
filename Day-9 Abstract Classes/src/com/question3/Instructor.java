package com.question3;

public class Instructor extends Person {
    int instructorId;
    int salary;
    @Override
    public String toString(){
        return "Instructor{" +
                "instructorid=" + instructorId +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                '}';
    }

    public Instructor(String name, String address, String gender, int instructorId, int salary) {
        super(name, address, gender);
        this.instructorId = instructorId;
        this.salary = salary;
    }
}

package com.question3;

public class Student {
    private  int roll;
    private String name;
    private String address;
    private String collegeName;

    Student(int roll, String name, String address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.collegeName = "NIT";
    }
    Student(int roll, String name, String address,String college){
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.collegeName = college;
    }
    public void printdata(){
        System.out.println(roll);
        System.out.println(name);
        System.out.println(address);
        System.out.println(collegeName);
    }

    public static Student getStudent(boolean isFromNIT){
        Student student1;
        if(isFromNIT){
            student1 = new Student(12, "Bhanu", "Hyderabad");
        }else{
            student1 = new Student(12, "Jai Balaya", "Warangal", "AHTC");
        }
        return student1;
    }

    public static void main(String[] args) {
        getStudent(false).printdata();
        getStudent(true).printdata();
    }



}

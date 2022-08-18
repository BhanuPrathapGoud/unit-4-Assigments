package com.question1;

public class Student {
    private int roll;
    private String name;
    private int age;
    private int marks;
    public void getData(){
        System.out.println(roll);
        System.out.println(name);
        System.out.println(marks);
        System.out.println(age);
    }
    public void setData(int roll , String name , int age , int marks){
        if(18 < age && age< 60 && marks > 0 && marks < 500 ){
            this.roll = roll;
            this.name = name;
            this.age = age;
            this.marks = marks;
        }
        else{
            System.out.println("Please Enter valid age and marks !");
        }
    }


}


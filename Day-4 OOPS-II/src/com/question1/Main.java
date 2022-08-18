package com.question1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setData(420,"Bhanu",23,400);
        student1.getData();
        System.out.println("-----------");
        Student student2 = new Student();
        student1.setData(99,"Goud",65,55);
        student2.getData();
        System.out.println("-----------");

        Student student3 = new Student();
        student3.setData(99,"prathap",27,55);
        student3.getData();


    }
}



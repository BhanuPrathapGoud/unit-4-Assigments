package com.question1;

public class AllStudents {
    public static void main(String[] args) {
        HistoryStudent history = new HistoryStudent("Bhanu","Hyderabad",85,95);
        history.getPercentage();
        ScienceStudent science = new ScienceStudent("Prathap","Warangal",50,45,55);
        science.getPercentage();
    }
}

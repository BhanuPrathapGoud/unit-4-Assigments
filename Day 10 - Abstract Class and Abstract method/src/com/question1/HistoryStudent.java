package com.question1;

import java.util.Scanner;

public class HistoryStudent extends Student{
    int historyMarks;
    int civicsMark;

    public HistoryStudent(String name, String address, int historyMarks, int civicsMark) {
        super(name, address);
        this.historyMarks = historyMarks;
        this.civicsMark = civicsMark;
    }



    @Override
    public void getPercentage() {
        double avg = ((historyMarks+civicsMark)/200f)*100;
        System.out.println(avg);
    }
}

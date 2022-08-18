package com.question1;

public class ScienceStudent extends Student {
    int physicsMarks;
    int chemistryMarks;
    int mathsMarks ;

    public ScienceStudent(String name, String address, int physicsMarks, int chemistryMarks, int mathsMarks) {
        super(name, address);
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.mathsMarks = mathsMarks;
    }
    @Override
    public void getPercentage() {
        float avg = ((physicsMarks+chemistryMarks+mathsMarks)/300f)*100;
        System.out.println(avg);
    }
}

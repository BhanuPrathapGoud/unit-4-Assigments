package com.question3;

public abstract class Evaluation {
    private final int numberOfQuestions;
    public Evaluation(int numberOfQuestions){
        this.numberOfQuestions = numberOfQuestions;
    }
    abstract void evaluationTiming();
    void printNoOfQuestions() {
        System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions);
    }

}

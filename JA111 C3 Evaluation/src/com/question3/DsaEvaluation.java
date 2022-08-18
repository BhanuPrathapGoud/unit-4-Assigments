package com.question3;

public class DsaEvaluation extends Evaluation{
    @Override
    public void evaluationTiming(){
        System.out.println("Evaluation timing is 9:30 to 11:00");
    }
    public DsaEvaluation(int numberOfQuestions){
        super(numberOfQuestions);
    }


}
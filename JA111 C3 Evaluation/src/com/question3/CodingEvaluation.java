package com.question3;

public class CodingEvaluation extends Evaluation{
    @Override
    public void evaluationTiming(){
        System.out.println("Evaluation timing is 2:00 to 3:30");
    }
    public CodingEvaluation(int numberOfQuestions){
        super(numberOfQuestions);
    }

}

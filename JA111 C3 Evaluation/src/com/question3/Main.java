package com.question3;

public class Main {
    public void messageToStudents(Evaluation evaluation) {
        if (evaluation instanceof CodingEvaluation) {
            System.out.println("Its a Coding Evaluation");
        } else {
            System.out.println("Its a DSA Evaluation");
        }
        evaluation.printNoOfQuestions();
        evaluation.evaluationTiming();

    }

    public static void main(String[] args) {
        Main object = new Main();
        object.messageToStudents(new DsaEvaluation(10));
        System.out.println("=============================");
        object.messageToStudents(new CodingEvaluation(5));
    }
}

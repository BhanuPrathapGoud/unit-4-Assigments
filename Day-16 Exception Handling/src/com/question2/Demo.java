package com.question2;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        try {
            System.out.println("The quotient of " + (num1/num2));
        }catch (ArithmeticException ae){
            System.out.println("DivideByZeroException caught");
        }finally {
            System.out.println("Inside finally block");
        }
    }
}

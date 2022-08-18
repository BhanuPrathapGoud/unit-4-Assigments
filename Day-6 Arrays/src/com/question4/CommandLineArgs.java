package com.question4;

public class CommandLineArgs {
    public static void main(String[] args) {
        if (args.length == 1){
            int num = Integer.parseInt(args[0]);
            int factorial = 1;
            for(int i = 1 ; i <=num ; i++){
                factorial *= i;
            }
            System.out.println(factorial);
        } else if (args.length == 2) {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num = Math.abs(num1 - num2);
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        } else {
            System.out.println("Error");
        }
    }
}

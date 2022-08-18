package com.question4;

import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            Test t=new Test();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Number");
            int num = scanner.nextInt();
            int[] arr= t.display(num);//Take this argument from user using the Scanner class
                //Write the logic to print the elements
            for(int i = 0 ; i < arr.length ; i++){
                if (arr[i]!= 0){
                    System.out.println(arr[i]);
                }
            }
        }

}

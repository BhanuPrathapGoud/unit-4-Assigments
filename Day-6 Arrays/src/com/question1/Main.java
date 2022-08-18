package com.question1;

import java.util.Scanner;

public class Main {
    public static String reverse(String input){
        String out = "";
        for(int i = input.length()-1 ;i >= 0  ; i--){
            out += input.charAt(i);
        }
        return out;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String originalString = sc.next();

        String result =reverse(originalString);

        System.out.println(originalString);
        System.out.println(result);
    }
}

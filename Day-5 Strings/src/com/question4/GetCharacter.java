package com.question4;

import java.util.Scanner;

public class GetCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");
        String input = scanner.nextLine();
        System.out.println("Enter the character position you want to access:");
        int index = scanner.nextInt();
        System.out.println("Character at position  is :" + input.charAt(index));
    }
}

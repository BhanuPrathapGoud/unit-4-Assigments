package com.question2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        System.out.println("Enter the number of elements in the array");
        int[] array = new int[l];
        System.out.println("Enter the elements in the array");
        for (int i = 0 ; i < l ; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the index of the array element you want to access");
        try {
            int num = scanner.nextInt();
            System.out.println(array[num]);
            System.out.println("The array element successfully accessed");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        }catch (NumberFormatException e){
            System.out.println("java.lang.NumberFormatException");
        }
    }
}

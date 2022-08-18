package com.question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPassenger = scanner.nextInt();
        int numberOfKms = scanner.nextInt();;
        OLA myOla = new OLA();


        Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms);
        int res = myOla.calculateBill(myCar);
        System.out.println("The total fare amount is"+ res);
    }

}

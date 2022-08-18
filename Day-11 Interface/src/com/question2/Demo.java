package com.question2;

import java.util.Scanner;

public class Demo {
    public Hotel provideFood(int amount){
        if(amount > 1000){
            return new TajHotel();
        } else if (amount > 200 && amount <= 1000) {
            return new RoadSideHotel();
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Amount");
        int amount = scanner.nextInt();
        Hotel hotel = d1.provideFood(amount);
        if(hotel != null){
            hotel.chickenBiryani();
            hotel.masalaDosa();
            if(hotel instanceof TajHotel){
               ((TajHotel) hotel).welcomeDrink();
            }
        }else{
            System.out.println("Please Enter a valid amount");
        }
    }
}

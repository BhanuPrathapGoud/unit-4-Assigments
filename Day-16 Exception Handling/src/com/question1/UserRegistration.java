package com.question1;

import java.util.Scanner;

public class UserRegistration {
    public void registerUser(String username,String userCountry) throws InvalidCountryException {
        if(userCountry.equals("india")){
            System.out.println("User registration done successfully");
        }else {
            throw new InvalidCountryException("User Outside India cannot be registered");
        }
    }
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String username = scanner.next();
        System.out.println("Enter Your Country:");
        String userCountry = scanner.next();

        try {
            userRegistration.registerUser(username,userCountry);
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}

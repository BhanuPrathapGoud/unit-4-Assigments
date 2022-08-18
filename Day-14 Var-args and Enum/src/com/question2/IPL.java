package com.question2;

import java.util.Scanner;

public class IPL {
    public void homeTeamStadium(Stadium stadium) {

        if(stadium != null) {

            stadium.message();

        }
        else
            System.out.println("invalid city");

    }



    public static void main(String[] args) {

        IPL d1 = new IPL();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Stadium Name");
        String team= sc.next();

        //String to enum conversion
        Stadium stadium= Stadium.valueOf(team.toUpperCase());

        d1.homeTeamStadium(stadium);


    }
}

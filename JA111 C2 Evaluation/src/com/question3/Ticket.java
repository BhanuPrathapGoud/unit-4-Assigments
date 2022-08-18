package com.question3;

import java.util.Scanner;

public class Ticket {
    int ticketid;
    int price;
    static int availableTickets = 0;
    public int calculateTicketCost(int nooftickets){
        if(availableTickets >= nooftickets){
            return nooftickets*this.price;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of bookings:");
        int numberOfBook = scanner.nextInt();
        System.out.println("Enter the available tickets:");
        availableTickets = scanner.nextInt();
        for(int i = 1 ; i <= numberOfBook ; i++){
            System.out.println(" Enter the ticketid:");
            ticket.ticketid = scanner.nextInt();
            System.out.println(" Enter the Price:");
            ticket.price = scanner.nextInt();
            System.out.println("Enter the number of tickets:");
            int nooftickets = scanner.nextInt();
            int x = ticket.calculateTicketCost(nooftickets);
            System.out.println(availableTickets);
            System.out.println("Total amount: "+x);
            availableTickets -= nooftickets;
            System.out.println("Available tickets:" +(availableTickets-nooftickets));
        }

    }
}

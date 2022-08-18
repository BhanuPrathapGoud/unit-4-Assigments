package com.question3;

import java.util.HashMap;
import java.util.HashSet;

public class Main{

    public static void main(String[] args) {
//Use suitable collection to store books by the name booksCollection
        HashSet<Book> booksCollection = new HashSet<>();
        booksCollection.add(new Book(1,"Name1","Author1"));
        booksCollection.add(new Book(2,"Name2","Author1"));
        booksCollection.add(new Book(3,"Name1","Author1"));
        booksCollection.add(new Book(1,"Name4","Author2"));
        for (Book book:booksCollection  ) {
            System.out.println(book.toString());
        }
//Implement the logic to iterate through the collection and print the books
    }
}
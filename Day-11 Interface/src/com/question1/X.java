package com.question1;

public interface X {
    void functionXAbstract();
    default void funXDefault(){
        System.out.println("I am Default function from X interface");
    }
    static void functionXStatic(){
        System.out.println("I am Static function from X interface");
    }


}

//
//Q1) Define an interface X with:
//        ● one abstract method
//        ● one default method
//        ● one static method
//
//        Define an interface Y with:
//
//        ● one abstract method
//        ● one default method
//        ● one static method
//
//        Note: Use your own method name.
//        Define another interface Z which extends both the interfaces X and Y:
//        And place another abstract method inside this Z interface.
//        Create a class ZImpl as the implementation of the Z interface.
//        From the main method of the Demo class call the methods of interface X, Y, Z.
//        Note: default method of X should be overridden whereas the default method of Y
//        should not be overridden inside the implementation class.
package com.question1;

public interface Y {
    void functionYAbstract();
    default void funYDefault(){
        System.out.println("I am Default function from Y interface");
    }
    static void functionYStatic(){
        System.out.println("I am Static function from Y interface");
    }

}

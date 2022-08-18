package com.question2;

public abstract class Parent {
    int number;
    public  abstract void method1();
    public final void method2(){
        System.out.println("Parent class method2");
    }
    public  void method3(){
        System.out.println("Parent class method3");
    }


}

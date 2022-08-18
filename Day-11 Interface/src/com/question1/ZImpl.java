package com.question1;

public class ZImpl implements Z {

    @Override
    public void functionXAbstract() {
        System.out.println("I am interface function from X interface");
    }

    @Override
    public void functionYAbstract() {
        System.out.println("I am interface function from Y interface");
    }

    @Override
    public void functionZAbstract() {
        System.out.println("I am interface function from Z interface");
    }
    @Override
    public void funXDefault(){
        System.out.println("I am Default function from X interface implemented in Zimpl");
    }
}

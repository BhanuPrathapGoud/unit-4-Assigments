package com.question2;

public class Demo {
    Demo(){
        this(2);
        System.out.println("Zero args");
    }
    Demo(int a){
        this("Bhanu");
        System.out.println("int");
    }
    Demo(String b){
        this(25.f);
        System.out.println("string");
    }
    Demo(float c){

       this('X');
        System.out.println("float");
    }
    Demo(char x){
        System.out.println("Char");
    }
}
class Main{
    public static void main(String[] args) {
        Demo test = new Demo();

    }
}

package com.question2;

import java.util.Scanner;

public final class Child extends Parent{
    @Override
    public void method1() {
        System.out.println("Class Child method1");
    }
    @Override
    public void method3(){
        System.out.println("Class Child method3");
    }
    public void method4(){
        System.out.println("Class Child method4");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parent method = new Child();
        System.out.println("Enter the Number");
        method.number = scanner.nextInt();
        if(method.number  < 10 && 1 < method.number){
            System.out.println(method.number);
            method.method1();
            method.method2();
            method.method3();
            ((Child) method).method4();
        }else{
            System.out.println("Invalid Number");
        }
    }
}

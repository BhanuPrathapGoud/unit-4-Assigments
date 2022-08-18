package com.question4;

public class OddEvenError {

    int num;
    OddEvenError(int num){
        this.num = num;
    }
    public void printType(){
        if (num < 0){
            System.out.println("Error");
        }
        else if(num%2==0){
            this.num =  num + Math.abs(num%10 - 10);
            System.out.println(this.num);
        }
        else{
            System.out.println(num);
        }

    }
    public static void main(String[] args) {

        OddEvenError num1 = new OddEvenError(42);
        num1.printType();
        OddEvenError num2 = new OddEvenError(45);
        num2.printType();
        OddEvenError num3 = new OddEvenError(-99);
        num3.printType();

    }
}

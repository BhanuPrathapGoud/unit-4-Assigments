package com.question2;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Area();
        System.out.println(rectangle.rectangleArea(25,50));
        Shape square = new Area();
        System.out.println(square.squareArea(50));
        Shape circle = new Area();
        System.out.println(circle.circleArea(100));
    }
}

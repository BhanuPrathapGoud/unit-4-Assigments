package com.question3;

import com.question1.Circle;
import com.question1.Rectangle;
import com.question1.Square;

public class Shapes {

    public void area(Circle circle){
        double areas = 3.14*circle.radius;
        System.out.println(areas);
    }
    public void area(Square square){
        int areas = square.side*square.side;
        System.out.println(areas);
    }

    public void area(Rectangle rectangle){
        int areas = rectangle.length*rectangle.width;
        System.out.println(areas);
    }




    public static void main(String[] args) {
        Shapes s1 = new Shapes();
        Circle c1 = new Circle(5);
        s1.area(c1);
        Rectangle rec = new Rectangle(4,7);
        s1.area(rec);
        Square sqr = new Square(5);
        s1.area(sqr);

    }



}


package com.question1;

public class Demo {
    public static void main(String[] args) {
        System.out.println("==========XXXXXXXX===========");
        X x = new ZImpl();
        x.functionXAbstract();
        X.functionXStatic();
        x.funXDefault();


        System.out.println("==========yyyyyyyy===========");
        Y y = new ZImpl();
        y.functionYAbstract();
        y.funYDefault();
        Y.functionYStatic();

        System.out.println("==========ZZZZZZZZ===========");
        Z z = new ZImpl();
        z.functionZAbstract();
        z.funXDefault();
        z.functionXAbstract();
        z.funYDefault();
        z.functionYAbstract();

    }
}

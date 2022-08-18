package com.question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("Bhanu");
        array.add("prathap");
        array.add("goud");
        array.add("masai");
        array.add("school");
        System.out.println(" Traversing list through Iterator  ");
        Iterator itr=array.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(" Traversing list through For Each  ");
        for (String name: array ) {
            System.out.println(name);
        }
        System.out.println(" Traversing list through for Loop  ");
        for (int i = 0 ; i < array.size() ; i++){
            System.out.println(array.get(i));
        }
    }
}

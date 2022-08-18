package com.array;

import java.lang.reflect.Array;

public class Practice {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        array[0][1] = 5;
        array[0][5] = 10;
        int[][] array2 =  {{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,99,9,10}};



        System.out.println(array2[2][7]);
    }
}

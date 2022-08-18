package com.question2;

public class EvenSum {
    public static void evenSum(int[][] array){
        for(int row = 0 ; row < array.length ; row++){
            int bag = 0;
            for(int col = 0 ; col < array.length ; col++){
                if (array[col][row] % 2 == 0){
                    bag += array[col][row];
                }
            }
            System.out.println(bag);
        }
    }
    public static void main(String[] args) {
        int[][] array  = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        evenSum(array);

    }
}

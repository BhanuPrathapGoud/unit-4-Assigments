package com.array;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int [] array = new int[num];
        for(int i = 0 ; i < num ; i++){
            array[i] = scanner.nextInt();

        }
        array = quickSort(array,0,num-1);

        for(int i = 0 ; i < num ; i++){
            System.out.print(array[i]);

        }
    }
    public static int[]  quickSort(int[] array, int left , int right){
        if(left <= right){
            return array ;
        }
        int index = partition(array,left,right);
        quickSort(array,left,index-1);
        quickSort(array,index+1,right);

        return array;
    }
    public static int partition(int[]array,int left,int right){
        int pilot = left;
        int low = left;
        int high = right;
        while(low < high){
            while(low < right && array[low] <= array[pilot]){
                left++;
            }
            while(high > left && array[high] > array[pilot]){
                right--;
            }
            if(low < high){
                array = swap(array,low , high);
            }
        }
        array = swap(array,pilot,high);
        return high;
    }
    public static int[] swap(int[] array,int i , int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
}
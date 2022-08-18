package com.array;

public class CountNumberZeros {
    public static void main(String[] args) {
        System.out.println(count(2007840009));
    }
    public static int count(int num){
        return helper(num,0);
    }
    public static int helper(int num,int count){
        if(num == 0){
            return count;
        }
        int rem = num%10;
        if(rem == 0){
            return helper( num/10, count+1);
        }
            return helper( num/10, count);

    }
}

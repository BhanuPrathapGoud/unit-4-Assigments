package com.array;

public class BinaryDearch {

    public static void main(String[] args) {
        int[] arr = {0 ,2 ,4 ,4 ,5, 5, 7 ,7, 9, 10};
        int target = 11;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(target < arr[mid]){
                right = mid-1;
            } else if (target > arr[mid]) {
                left = mid+1;
            }else {
                return mid;
            }
        }
        return right;
    }
}

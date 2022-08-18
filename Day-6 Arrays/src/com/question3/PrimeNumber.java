package com.question3;

public class PrimeNumber {
    public int[] findAndReturnPrimeNumbers(int[] inputArray){
        int topr = 0;
        int[] array =  new int[inputArray.length];

        for(int i = 0 ; i < inputArray.length ; i++){
            if(primeChecker(inputArray[i])){
                array[topr] = inputArray[i];
                topr++;
            }
        }
        return array;
    }
    boolean primeChecker(int num){
        if(num <= 1){
            return false;
        }
        else{
            for(int i = 2 ; i < num ; i++){
                if(num%i == 0) return false;
            }
            return true;
        }
    }
    public static void main(String[] args){
        PrimeNumber prime1 = new PrimeNumber();
        int[] arr = {10,12,5,50,11,14,15};
        int[] result = prime1.findAndReturnPrimeNumbers(arr);
        for(int i = 0 ; i < result.length ; i++ ){
            if (result[i] != 0){
                System.out.println(result[i]);
            }
        }

    }


}

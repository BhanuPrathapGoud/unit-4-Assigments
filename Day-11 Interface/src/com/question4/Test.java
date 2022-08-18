package com.question4;

public class Test implements Intr{
    @Override
    public int[] display(int p) {
        int[] array = new int[p];
        for(int i = 2 ; i < p ; i++){
            boolean prime = true;
          for(int j = 2 ; j < i ; j++){
              if(i%j== 0) {
                  prime = false;
                  break;
              }
          }
          if (prime) array[i] = i;
        }
        return array;
    }
}

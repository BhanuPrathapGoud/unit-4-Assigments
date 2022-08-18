package JavaFundamentals;

public class primeFactorial {
    public static void main (String []  args){
        int num = 120;
        if(num < 2 || num > 100){
            System.out.println("Invalid Number");
        }else{
            for(int i = 1 ; i <= num ; i++){
                if(num % i == 0){
                    System.out.println(i);
                }
            }
        }
        num = 12;
        if(num < 2 || num > 100){
            System.out.println("Invalid Number");
        }else{
            for(int i = 1 ; i <= num ; i++){
                if(num % i == 0){
                    System.out.println(i);
                }
            }
        }
        num = 1;
        if(num < 2 || num > 100){
            System.out.println("Invalid Number");
        }else{
            for(int i = 1 ; i <= num ; i++){
                if(num % i == 0){
                    System.out.println(i);
                }
            }
        }
    }
}

package lamdaFunction;


public class Passinglamda {
    public static void main(String[] args) {
        //lambda Syntax = (args) -> body;
//        Calculator calculator = (n1,n2) -> n1+n2;
//        System.out.println(calculator);
        System.out.println(getOutput(25,60,((n1,n2) -> n1+n2)));
    }
    public static int getOutput(int num1,int num2, Calculator operation){
        int nunun = 420;
        return nunun;
    }




}
interface Calculator {
    public int calculate(int num1,int num2);
}

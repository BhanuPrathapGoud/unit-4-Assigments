package com.masai;

public class Lion {
    String name;
    boolean isHungry;
    int age;
    static int totalDeaths;



    public  void thinking(boolean isHungry,int totalDeaths , int age){
        if(isHungry == false ){
            System.out.println("LionName is sleeping;");
        } else if (isHungry=true && age>12) {
            System.out.println("lionName has eaten two animal");
        } else if (isHungry=true && age<=12  && age >=2) {
            System.out.println("lionName has eaten one animal");
        } else if (isHungry=true && age<=2) {
            System.out.println("lionName is calling Mom");
        }
    }


    public  void  printKillings(){
        System.out.println("Total killings by lions in jungle = "+totalDeaths);
    }

    public static void main(String[] args) {
        Lion lion1 = new Lion();
        lion1.thinking(true,2,13);
        lion1.totalDeaths = 5;

        Lion lion2 = new Lion();
        lion2.thinking(false,2,12);
        lion2.printKillings();
        lion2.totalDeaths = 12;
        Lion lion3 = new Lion();
        lion3.thinking(true,2,5);
        lion3.printKillings();

    }

}

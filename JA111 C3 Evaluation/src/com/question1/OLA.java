package com.question1;

public class OLA {
    public Car bookCar(int numberOfPassenger, int numberOfKMs){
        if(numberOfPassenger <= 3){
            return new HatchBack();
        }else{
            return new Sedan();
        }
    }
    public int calculateBill(Car car){
        int x = car.getNumberOfPassenger();
        int y = car.getNumberOfPassenger();
     int total_fare=x*y;
        return total_fare;
    }
}

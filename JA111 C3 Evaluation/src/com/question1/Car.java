package com.question1;

public class Car {
    private int numberOfPassenger;
    private int numberOfKms;
    public Car (int numberOfPassenger, int numberOfKms){
        setNumberOfKms(numberOfKms);
        setNumberOfPassenger(numberOfPassenger);
    }

    public Car() {

    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public int getNumberOfKms() {
        return numberOfKms;
    }

    public void setNumberOfKms(int numberOfKms) {
        this.numberOfKms = numberOfKms;
    }
}

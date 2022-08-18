package com.question3;

public class Main {
    public static void main(String[] args) {
        Animal[]  animals = new Animal[3];
        Animal dog = new Dog();
        animals[0] = dog;
        Animal cat = new Cat();
        animals[1] = cat;
        Animal tiger = new Tiger();
        animals[2] = tiger;
        for(int i = 0 ; i < animals.length ; i++){
           animals[i].eat();
           animals[i].makeNoise();
           animals[i].walk();
        }

    }
}

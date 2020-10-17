package com.HoffmannMichael;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal ("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Dackel", 3,2, 2, 4, 1, 20, "braun");
//        dog.eat();

//        dog.drugSniffing();


        dog.walk();

        dog.run();



    }
}

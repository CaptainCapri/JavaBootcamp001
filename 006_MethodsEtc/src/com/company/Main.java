package com.company;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is " +
            "another " +
            "still more.");


        boolean gameOver = true;
        int score = 800;
        int lvlCompleted = 5;
        int bonus = 100;
//
//        if(score<5000) {
//            System.out.println("Your score was less than 5000 but more than 1000");
//        }
//        else if(score < 1000){
//            System.out.printf("your score ist less than 1000");
//        }
//        else {
//            System.out.println("Got here");
//        }

        if(gameOver) {
            int finalScore = score + (lvlCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

        }

        score = 10000;
        lvlCompleted = 8;
        bonus = 200;

        if(gameOver) {
            int finalScore = score + (lvlCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

        }

	}
}

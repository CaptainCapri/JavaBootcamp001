package com.company;

public class Main {
    // Overloading Methods
    public static void main(String[] args) {
        int newScore = calculateScore("Fred", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();


        calculateScore()

    }



    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 100;

    }

    public static int calculateScore(int newScore){
        System.out.println("Unnamed Player scored " + newScore + " points");
        return newScore * 100;

    }

    public static int calculateScore(){
        System.out.println("No Player, no playername");
        return 0;
    }


    public static calcFeetAndInchesToCentimeters(float feet, float inch){
        if (feet >= 0 || (feet >= 0 && feet < 12)){

        }
        else {
            return -1
        }

    }




}

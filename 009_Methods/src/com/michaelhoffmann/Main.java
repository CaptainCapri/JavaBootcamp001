package com.michaelhoffmann;

public class Main {

    public static void main(String[] args) {


        int highScore = calculateScore(true, 800, 5, 100);

        System.out.println(highScore);

        highScore = calculateScore(true, 1000, 8, 200);

        System.out.println(highScore);

        boolean gameOver = true;
        int score = 490;
        int levelCompleted = 1;
        int bonus = 10;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);

        System.out.println(highScore);


        String name = "Walter";
        int playerScore = calculateScore(gameOver, score, levelCompleted, bonus);
        int position = calculateHighScorePosition(playerScore);
        displayHighscorePosition(name, position);





    }

    public static int calculateScore(boolean gamOver, int score, int levelCompleted, int bonus){
        if(gamOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;
    }


    public static void displayHighscorePosition(String name, int position){
        System.out.println("Player " + name + " reached position: " + position);
    }

    public static int calculateHighScorePosition(int playerScore){

        if (playerScore > 1000){
            return 1;
        }
        else if (playerScore <= 1000 && playerScore > 500){
            return 2;
        }
        else if (playerScore <= 500 && playerScore > 100);{
            return 3;
        }
        else return 4;
    }


}

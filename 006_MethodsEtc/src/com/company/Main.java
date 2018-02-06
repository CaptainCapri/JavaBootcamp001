package com.company;

public abstract class Main {

    public static void main(String[] args) {
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is " +
            "another " +
            "still more.");

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

        boolean gameOver = true;
        int score = -10000;
        int lvlCompleted = 5;
        int bonus = 100;


        calculateScore(true, 800,5,100);
        calculateScore(false, score,lvlCompleted,bonus );

	}

	public static int calculateScore(boolean gameOver,int score, int lvlCompleted, int bonus){

        if(gameOver) {
            int finalScore = score + (lvlCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            if (finalScore >= 0) {
                return finalScore;
            }
            else {
                return 0;
            }

            }
        else {
            return 10;
        }


    }


   String playerName = "Rolf";
   // int playerScore = 0;
	int position = calculateHighScorePosition(0);

    displayHighScorePosition("Rolf",position);



    public static void displayHighScorePosition (String playerName, int position){
        System.out.("Player: " + playerName
                + " reached Position: " + position);
      //  }

    public static int calculateHighScorePosition (int playerScore){
        if (playerScore > 1000) {return 1;}
        else if (playerScore < 1000 && playerScore > 500) {return 2;}
        else if (playerScore > 500 && playerScore > 100) {return 3;}
        else return 4;
    }

}

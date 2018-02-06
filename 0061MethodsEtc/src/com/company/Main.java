package com.company;

public class Main {

    public static void main(String[] args) {

       // System.out.println();

        //String playerName = "Rolf";
        // int playerScore = 0;


        int position = calculateHighScorePosition(1000);
        displayHighScorePosition("Rolf", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Günther", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Harald", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Hackbratina", position);
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println("Player: " + playerName + " reached Position: " + position);
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore < 1000 && playerScore >= 500) {
            return 2;
        } else if (playerScore < 500 && playerScore >= 100) {
            return 3;
        } else return 4;




    }


}

package com.company;

public class Main {
    // Overloading Methods
    public static void main(String[] args) {
        //int newScore = calculateScore("Fred", 500);
        //System.out.println("New score is " + newScore);
        //calculateScore(75);
        //calculateScore();
        //calculateScore("blabla",1);


        calcFeetAndInchesToCentimeters(5,7);
        calcFeetAndInchesToCentimeters(83);

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


    public static double calcFeetAndInchesToCentimeters(double feet, double inch) {
        if (feet >= 0 && feet >= 0 && inch <= 12 && inch >= 0) {
            double i = feet * 30.48;
            double j = inch * 2.54;
            i = i + j;
            System.out.println(feet + "Feet and " + inch + " Inches are " + i + " Centimeters");
            return i;

        } else {
            System.out.println("Numbers invalid!");
            return -1;
        }

    }

    public static double calcFeetAndInchesToCentimeters(double inch) {
        if (inch >= 0) {
            //double j = inch * 2.54;
            double i = inch % 12;
            //i = i * 2.54;
            double j = Math.floor(inch / 12);

            System.out.println("feet: " + j + " inch: " + i);
            calcFeetAndInchesToCentimeters(j,i);


            return 0;

        } else {
            System.out.println("Numbers Invalid!");
            return -1;
        }

    }




}

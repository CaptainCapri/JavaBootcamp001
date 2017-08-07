package com.company;

public class Main {

    public static void main(String[] args) {

        int result01 = 1+2;
        int result02 = 522 / 3;
        int result03 = 7 - 3;

        System.out.println("1+2 =" +result01);

        int previousResult = result01;
        result01 = result01 -1;
        System.out.println(previousResult + " - 1 =" + result01);

        previousResult = result01;
        result01 = result01 * 10;
        System.out.println(previousResult + "*10 = " + result01);


        previousResult = result01;
        result01 = result01 / 5;
        System.out.println(previousResult +" /5 = " + result01);

        previousResult = result01;
        result01 = result01 % 3;
        System.out.println(previousResult + " %3 =" +result01);

        previousResult = result01;
        result01 = result01 +1;
        System.out.println("Result is now" + result01);
        result01++;
        System.out.println("Result is now" + result01);
        result01--;
        System.out.println("Result is now" + result01);
        result01 += 2;
        System.out.println("Result is now" + result01);
        result01 *= 10;
        System.out.println("Result is now" + result01);
        result01 -= 10;
        System.out.println("Result is now" + result01);
        result01 /=10;
        System.out.println("Result is now" + result01);

        boolean isAlien = true;
        if (isAlien == false)
            System.out.println("It is not an Alien!");
        else
            System.out.println("ALIEN!");


        int topScore = 80;
        if (topScore < 100)
            System.out.println("Keep on trying");
        else if (topScore == 100)
            System.out.println("Highscore!!");
        else
            System.out.println("Invalid Value");

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore <100) //both conditions have to be true
            System.out.println("Greater than top score, but not Highscore100");







    }
}

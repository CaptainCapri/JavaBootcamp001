package Exercises;

public class Challenge_calculateInterest {

    public static void main(String[] args) {

        int amount = 10000;

        for (int i=8; i>1; i--) {
            System.out.println(amount +" at " + i + "% interest = " + String.format("%.2f",calculateInterest(amount, i)));
        }

    }

    public static double  calculateInterest (double amount, double interestRate){
        return(amount * (interestRate/100));



    }



}

package com.michaelhoffmann;

public class For_Statement {

    public static void main(String[] args) {
        //System.out.println("10.000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        double interestRate = 2;
        int startNumber = 10;
        int endNumber =50;
        int count = 0;
/*
        for (int i = 8; i > 1; i--) {
            System.out.println("10.000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
*/
        for (int f = startNumber; f <= endNumber; f++) {
            if (isPrime(f)) {
                System.out.println(f);

                count++;
                if (count == 10) {
                    System.out.println("Exiting for-loop");
                    break;
                }
            }
        }

//        System.out.println(isPrime(23));

    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount *(interestRate/100));

    }

    public static boolean isPrime(int primeNumber){

        for(int i = 2 ; i < primeNumber; i++){
            int j = primeNumber % i;
            if(j == 0)return false;
        }
        return true;

    }



}

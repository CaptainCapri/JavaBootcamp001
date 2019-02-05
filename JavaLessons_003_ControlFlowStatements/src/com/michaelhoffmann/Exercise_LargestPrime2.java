package com.michaelhoffmann;

public class Exercise_LargestPrime2 {

    public static void main(String[] args) {
        getLargestPrime(250);
    }


    public static void getLargestPrime (int number) {
        if (number < 1) System.out.println("Invalid Value");

        int prime = 1;
        int divider = 1;
        int largestPrime = -1;
        boolean isPrime = true;


        for (divider = 1; divider < number; divider++) {
            if (number % divider == 0) System.out.println(divider);
        }


        while (prime < number) {

            while (prime > divider) {

                if (prime % divider != 0) divider++;

                else{
                    isPrime = false;
                    break;
                }


            }
            if (isPrime == true) System.out.println("this is the prime: " + prime);
            prime ++;
        }

    }

}


package com.michaelhoffmann;

public class Exercise_LargestPrime {
    public static void main(String[] args) {

        System.out.println(getLargestPrime(7));

    }

    public static int getLargestPrime(int number){
        if(number<=1) return -1;
        int largestPrime = -1;
        int dividerNumber = -1;
        boolean primeCheck = true;
        for(int count = 2; count <= number; count++){
            //System.out.println("round:" + count);
            int isDivider = number % count;
            if(isDivider == 0) {
                dividerNumber = count;
                for (int i = 2; i < dividerNumber; i++) {
                    int isPrime = dividerNumber % i;
                    if (isPrime == 0) {
                        primeCheck = false;
                    }
                }
                if (primeCheck) largestPrime = dividerNumber;
            }

        }
        return largestPrime;

    }

}

package com.michaelhoffmann;

public class FirstAndLastDigit {
    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(20));

    }

    public static int sumFirstAndLastDigit(int wholeNumber ){
        if (wholeNumber < 0) return -1;
        int firstDigit = wholeNumber % 10;

        System.out.println(firstDigit);

        while (wholeNumber >= 10){
            wholeNumber = wholeNumber / 10;

        }
        System.out.println(wholeNumber);
        wholeNumber = wholeNumber + firstDigit;




        return wholeNumber;
    }

}

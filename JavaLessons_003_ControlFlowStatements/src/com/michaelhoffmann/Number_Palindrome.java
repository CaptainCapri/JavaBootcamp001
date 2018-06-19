package com.michaelhoffmann;

public class Number_Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(12231));


    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int processedNumber = number;
        while (processedNumber!=0){
            reverse *= 10;
            reverse += processedNumber % 10;
            processedNumber /= 10;
        }
        if(number == reverse) return true;
        else return false;


    }



}

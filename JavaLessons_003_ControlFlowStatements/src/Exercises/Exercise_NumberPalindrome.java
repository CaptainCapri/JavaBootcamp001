package Exercises;

public class Exercise_NumberPalindrome {

    public static void main(String[] args) {

        System.out.println("Is palindrome? " + isPalindrome(-1));

    }

    public static boolean isPalindrome(int number){

        if (number < 0) number *= -1;

        int reverse = 0;
        int lastDigit = 0;
        int useNumber = number;

        while (useNumber > 0){

            reverse *= 10;
            reverse += useNumber % 10;
            useNumber /= 10;

        }

        if (number == reverse) return true;
        else return false;



    }



}

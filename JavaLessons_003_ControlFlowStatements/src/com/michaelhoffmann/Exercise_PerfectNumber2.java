package com.michaelhoffmann;

public class Exercise_PerfectNumber2 {

    public static void main(String[] args) {
        isPerfectNumber(6);
    }




    public static boolean isPerfectNumber(int number){
        if (number < 1) return false;

        int divider = 1;
        int sum = 0;

        while (number > divider) {
            if (number % divider == 0) sum = sum + divider;
            divider ++;
            System.out.println(sum);
        }

        if (sum == number) return true;
        else return false;

    }

}

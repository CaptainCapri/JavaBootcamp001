package com.michaelhoffmann;

public class Sum_Odd {

    public static void main(String[] args) {

        System.out.println(sumOdd(10,5));


    }

    public static boolean isOdd(int number){
        if((number <= 0) || number % 2 == 0) return false;
        else return true;
    }

    public static int sumOdd (int start, int end){
        if((end >= start) && (start > 0) && (end > 0)){
        int sum = 0;
            for(int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    System.out.println(i);
                    sum += i;
                }
            }
            return sum;

        }else return -1;


    }

}

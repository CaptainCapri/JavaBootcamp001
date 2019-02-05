package com.michaelhoffmann;

public class Exercise_PerfectNumber {
    public static void main(String[] args) {

        System.out.println(isPerfectNumber(17));


    }
    public static boolean isPerfectNumber(int number){
        if(number<1) return false;
        int checkNumber = 0;
        //int divisor = 1;

            for(int i = 1; i<number; i++){
            //while(divisor<number) {

                //System.out.println("divisor"+i);
                if (number % i == 0) checkNumber += i;
                //System.out.println("checkNumber"+checkNumber);
                //divisor++;
            }
        if(checkNumber == number)return true;
            else return false;
    }
}

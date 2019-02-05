package com.michaelhoffmann;

public class Exercise_GreatestCommonDivisor {
    public static void main(String[] args) {

        System.out.println("greatest Divisor is:"+getGreatestCommonDivisor(36,99));

    }

    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10) return-1;

        int divisor1 = 0;
        int highestDivisor1 = 0;
        int highestDivisor2 = 0;
        int highestDivisorBoth = 0;
        while(divisor1!=first){
            divisor1++;
            if (first%divisor1 == 0){
                highestDivisor1 = divisor1;
//                System.out.println("highestDivisor1:" + highestDivisor1);
                int divisor2 = 0;
                while(divisor2!=second){
                    divisor2++;

                    if (second%divisor2 == 0){
                        highestDivisor2 = divisor2;
//                        System.out.println("highestDivisor2:" + highestDivisor2);
                        if (highestDivisor1 == highestDivisor2) highestDivisorBoth = highestDivisor2;
 //                       System.out.println("2.Schleife Ende");
                    }
                }
            }//System.out.println("1.Schleife Ende");
        }return highestDivisorBoth;


    }

}

package com.michaelhoffmann;

public class Exercise_GreatestCommonDivisor2 {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(1010, 10));

    }

    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 | second < 10) return -1;

        int divider1 = 1;
        int divider2 = 1;

        int checkDivider1 = 1;
        int checkDivider2 = 1;

        int greatestDivider = 1;

        while (first >= divider1){
            if (first % divider1 == 0) checkDivider1 = divider1;
            //else break;

            while (second >= divider2){
                if (second % divider2 == 0) checkDivider2 = divider2;
                //else break;

                if (checkDivider1 == checkDivider2) greatestDivider = checkDivider1;

                //System.out.println("greatestDivider=" + greatestDivider);
                //System.out.println("checkDivider2=" + checkDivider2);
                divider2 ++;
            }

            divider2 = 1;
            //System.out.println("divider1=" + divider1);
            divider1 ++;

        }

        return greatestDivider;

    }



}

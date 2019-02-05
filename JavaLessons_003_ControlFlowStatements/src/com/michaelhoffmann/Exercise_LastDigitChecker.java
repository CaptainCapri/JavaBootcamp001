package com.michaelhoffmann;

public class Exercise_LastDigitChecker {

        public static void main(String[] args) {

            System.out.println(hasSameLastDigit(72, 73,234));

        }


        public static boolean hasSameLastDigit(int i, int j, int k){
            if ((i < 10) | (j < 10) | (k < 10) | (i > 1000) | (j > 1000) | (k > 1000)) return false;

            i = i % 10;
            j = j % 10;
            k = k % 10;

            //System.out.println(i + " = i  |  " + j + " = j  |  " + k + " = k  |  ");

            if (i == j) return true;
            else if (i == k) return true;
            else if (j == k) return true;
            else return false;

        }



    }

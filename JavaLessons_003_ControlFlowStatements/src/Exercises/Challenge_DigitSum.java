package Exercises;

public class Challenge_DigitSum {

    public static void main(String[] args) {

        System.out.println("Sum is: " + sumDigits(5));

    }

    public static int sumDigits (int number){
        if (number<10)return -1;
        System.out.println("Number is: " + number);
        int leastSig = 0;
        int sum = 0;

         while (number != 0){
             leastSig = number % 10;
             sum += leastSig;
             number /= 10;

         }

        return sum;






    }


}

package Exercises;

public class Exercise_FirstAndLastDigitSum {

    public static void main(String[] args) {

        System.out.println("sum is: " + sumFirstAndLastDigit(7));

    }

    public static int sumFirstAndLastDigit (int number){

        if (number < 0) return -1;

        int lastDigit = number % 10;
        int sum = 0;

        while (number>9){
            number /= 10;
        }

        sum = number + lastDigit;
        return sum;


    }


}

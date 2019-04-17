package Exercises;

public class Exercise_EvenDigitSum {

    public static void main(String[] args) {

        System.out.println("sum is: " + getEvenDigitSum(163478));

    }

    public static int getEvenDigitSum (int number){

        if (number < 0) return -1;

        int sum = 0;

        while (number>0){
            if (number % 2 == 0) sum += number % 10;
            number /= 10;
        }


        return sum;

    }

}

package Exercises;

public class Exercise_PerfectNumber {

    public static void main(String[] args) {

        System.out.println("is perfect number? " + isPerfectNumber(-1));

    }

    public static boolean isPerfectNumber (int number){
        if (number<1)return false;

        int factor = 1;
        int factorSum = 0;

        while (factor<number){
            if ((number%factor)==0) factorSum += factor;
            factor++;
        }

        if (factorSum == number) return true;
        else return false;
    }

}

package Exercises;

public class Exercise_LargestPrime {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(0));

    }

    public static int getLargestPrime(int number){

        if (number<=1) return -1;

        int largestPrime = 0;
        int divisor = 1;

        while (divisor<=number) {


            int startnumber = divisor;
            startnumber--;
            boolean isPrime = true;
            for (int i = startnumber; i > 1; i--) {
                int primecheck = divisor % i;
                if (primecheck == 0) isPrime = false;
            }


            if (((number % divisor) == 0) && isPrime) largestPrime = divisor;
            divisor++;
        }
        if (largestPrime>0)return largestPrime;
        else return -1;
    }
}

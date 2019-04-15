package Exercises;

public class Exercise_PrimeNumber {

    public static void main(String[] args) {

//        System.out.println(isPrime(13));

        int count = 0;
        for (int i =0; i<50; i++){
            if (isPrime(i)){
                System.out.println("Prime: " + i);
                count ++;
            }

            if (count >= 10) break;
        }
    }
    public static boolean isPrime(int number){

        int primecheck = -1;
        int startnumber = number;
        startnumber--;

        for (int i = startnumber; i > 1; i--) {
            primecheck = number % i;
//            System.out.println(primecheck);
            if (primecheck == 0) return false;
        }

        return true;


        }
    }



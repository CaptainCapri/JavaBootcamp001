package Exercises;

public class Exercise_NumberToWords {

    public static void main(String[] args) {

        numberToWords(1200);

    }

    public static void numberToWords(int number){

        if (number<0) System.out.println("Invalid Value");

        int reverseNumber = reverse(number);

        for (int i = getDigitCount(number); i>0; i-- ){
            int printNumber = reverseNumber % 10;

            switch (printNumber){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("ERROR!");
                    break;
            }
            reverseNumber /= 10;

        }


    }

    public static int reverse(int number){

        int reverseNumber = 0;
        boolean negative = false;

        if (number<0) {
            number *= -1;
            negative = true;
        }

        while (number>0){
            reverseNumber *= 10;
            reverseNumber += number % 10;
            number /= 10;
        }
        if (negative) reverseNumber *= -1;

        return reverseNumber;

    }

    public static int getDigitCount (int number){

        if (number<0) return -1;

        if (number==0) return 1;

        int count = 0;
        while (number>0){
            count++;
            number /=10;
        }
        return count;
    }

}

package Exercises;

public class Lesson_WhileDoStatement {

    public static void main(String[] args) {
//        int count = 1;
//        while (count != 6){
//            System.out.println("Count was: " + count);
//            count++;
//        }
//
//
//
//        do {
//            System.out.println("Count calue was " + count);
//            count ++;
//        } while(count != 6);

        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            count++;
            System.out.println("Even number " + number);
        }
        System.out.println("founf even number: " + count);


//
   }

   public static boolean isEvenNumber(int i){
        if ((i%2) == 0) return true;
        else return false;

   }



}

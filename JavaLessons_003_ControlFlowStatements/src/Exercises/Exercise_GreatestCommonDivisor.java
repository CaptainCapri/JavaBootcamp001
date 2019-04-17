package Exercises;

public class Exercise_GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(81,153));

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first<10 || second<10) return -1;

        int greatestDivisor1 = 1;
        int greatestDivisorBoth = 1;
        int check1 = 1;


        while (check1 <= first){

            int check2 = 1;
            if ((first % check1) == 0) {

                greatestDivisor1 = check1;
                while (check2 <= second){
                    if ((second % check2 == 0)&&(check2 == greatestDivisor1)) greatestDivisorBoth = check2;

                    check2++;
                }

            }

            check1++;


        }

        return greatestDivisorBoth;


    }



}

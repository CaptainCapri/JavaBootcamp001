package Exercises;

public class Challenge_Sum3And5 {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i++){

            int check3 = i % 3;
            int check5 = i % 5;

            if (check3 == 0 && check5 == 0){
                System.out.println(i);
                count++;
                sum += i;
            }
            if (count >= 5) break;
        }
        System.out.println("Sum: " + sum);



    }

}

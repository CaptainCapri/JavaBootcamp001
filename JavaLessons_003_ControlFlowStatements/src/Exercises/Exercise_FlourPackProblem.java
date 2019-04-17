package Exercises;

public class Exercise_FlourPackProblem {

    public static void main(String[] args) {

        System.out.println(canPack(0,5,6));

    }

    public static boolean canPack (int bigCount, int smallCount, int goal){
        if (bigCount<0 || smallCount<0 || goal<0) return false;

            while (goal>=5 && bigCount>0){
                bigCount--;
                goal -= 5;
            }

            while (goal>0 && smallCount>0){
                smallCount--;
                goal--;
            }

            if (goal == 0) return true;
            else return false;






    }

}

package com.michaelhoffmann;

public class Exercise_FlourPackProblem {
    public static void main(String[] args) {

        System.out.println(canPack(-3,2,12));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount<0 || smallCount<0 || goal<0) return false;
        int fill = 0;
        while(bigCount>0){
            fill += 5;
            if(fill>goal){
                fill -= 5;
                break;
            }
            bigCount --;

        }

        while(fill<goal && smallCount>0){
            fill ++;
            smallCount --;
            if(smallCount<0)return false;
        }

        if (fill == goal) return true;
        else return false;


    }


}

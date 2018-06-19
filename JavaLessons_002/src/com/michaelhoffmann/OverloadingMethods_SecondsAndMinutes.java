package com.michaelhoffmann;

public class OverloadingMethods_SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {



        String i = getDurationString(65,75);
        System.out.println(i);


        String j = getDurationString(3945);
        System.out.println(j);

    }

    public static String getDurationString(int minutes,int seconds){
        if(minutes < 0 || seconds <0 || seconds > 59) return INVALID_VALUE_MESSAGE;
        else {
            int hours = minutes / 60;
            minutes = minutes % 60;


            String hourString = Integer.toString(hours);
            String minuteString = Integer.toString(minutes);
            String secondString = Integer.toString(seconds);

            if(hours < 10) hourString = "0" + hourString;
            if(minutes < 10) minuteString = "0" + minuteString;
            if(seconds < 10) secondString = "0" + secondString;



            String outPut = hourString + "h " +  minuteString + "m " + secondString + "s";


            return outPut;

        }

    }

    public static String getDurationString(int seconds){
        if(seconds <0) return INVALID_VALUE_MESSAGE;
        else {
            int minutes = seconds / 60;
            seconds = seconds % 60;

            String outPut = getDurationString(minutes, seconds);

            return outPut;

        }

    }



}

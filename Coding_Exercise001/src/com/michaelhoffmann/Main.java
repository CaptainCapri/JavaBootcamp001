package com.michaelhoffmann;

public class Main {

    public static void main(String[] args) {

        int kiloBytes = 10030;
        printMegaBytesAndKiloBytes(kiloBytes);

    }


    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes >= 0) {
            int restKiloBytes = kiloBytes % 1024;
            int megaBytes = kiloBytes / 1024;

            //System.out.println("Kilobytes:" + restKiloBytes);
            //System.out.println("Megabytes:" + megaBytes);
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + restKiloBytes + " KB");
        }
        else{
            System.out.println("Invalid Value");
        }


    }


}

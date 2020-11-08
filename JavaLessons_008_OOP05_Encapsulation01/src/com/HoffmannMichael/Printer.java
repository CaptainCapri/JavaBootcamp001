package com.HoffmannMichael;

public class Printer {

    private int tonerLevel;
    private int printedPages;
    private boolean isduplex;

    public Printer(int tonerLevel, int printedPages, boolean isduplex) {
        if (tonerLevel < 0) System.out.println("Toner empty");
        this.tonerLevel = tonerLevel;
        this.printedPages = printedPages;
        this.isduplex = isduplex;
    }

    public void fillToner(){
        tonerLevel = 100;
        System.out.println("Toner Level filled to " + tonerLevel);
    }

    private int reduceToner(){
        if (this.tonerLevel <= 0){
            System.out.println("Toner empty, please refill");
            return 0;
        }
        else{
            this.tonerLevel = this.tonerLevel--;
            return this.tonerLevel;
        }
    }

    public void printPages(int numberPages){

        for (int i = 0; i < numberPages; i++) {
            this.reduceToner();
        }

        printedPages = (int) (printedPages - Math.ceil(numberPages/2));

        System.out.println("Pages printed: " + printedPages);
        System.out.println("Remaining Toner: " + tonerLevel + "%");

    }

    public void printerCategory(){
        if (isduplex) System.out.println("this printer is duplex");
        else System.out.println("this printer is NOT duplex");
    }


}

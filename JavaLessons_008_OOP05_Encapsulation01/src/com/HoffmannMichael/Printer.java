package com.HoffmannMichael;

public class Printer {

    private int tonerLevel;
    private int printedPages;
    private boolean isduplex;

    public Printer(int tonerLevel, int printedPages, boolean isduplex) {
        if (tonerLevel < 0) {
            System.out.println("Toner empty");
            this.tonerLevel = 0;
        }
        this.tonerLevel = tonerLevel;
        this.printedPages = printedPages;
        this.isduplex = isduplex;
    }

    public void fillToner(){
        this.tonerLevel = 100;
        System.out.println("Toner Level filled to " + this.tonerLevel);
    }

    private int reduceToner(){
        if (this.tonerLevel <= 0){
            System.out.println("Toner empty, please refill");
            return -1;
        }
        else{
            this.tonerLevel--;
            if (this.tonerLevel <= 0){
                System.out.println("Toner empty, please refill");
                return -1;
            }
            System.out.println("TonerLevel is: " + this.tonerLevel);
            return this.tonerLevel;
        }
    }

    public void printPages(double numberPages){

        for (int i = 0; i < numberPages; i++) {
            this.reduceToner();
        }
        if (this.isduplex)this.printedPages = (int) (this.printedPages + Math.ceil(numberPages/2.0));
        else this.printedPages += numberPages;
        System.out.println("Pages printed: " + this.printedPages);
        System.out.println("Remaining Toner: " + tonerLevel + "%");

    }

    public void printerCategory(){
        if (isduplex) System.out.println("this printer is duplex");
        else System.out.println("this printer is NOT duplex");
    }


}

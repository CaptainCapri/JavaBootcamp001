package com.HoffmannMichael;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(210, 465, 470);
        Case theCase = new Case("Eclipse P400A", "Phanteks", "Seasonic 550W gold", dimensions);

        Motherboard motherboard = new Motherboard("X570 Tomahawk", "MSI", 4, 2, "UEFI BIOS");

        Monitor monitor = new Monitor("S32DGF", "Dell", 32, new Resolution(2540, 1440));

        PC myPC = new PC(theCase, monitor, motherboard);

        myPC.powerUp();







    }
}

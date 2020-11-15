package com.HoffmannMichael;

public class Main {

    public static void main(String[] args) {
        //    public static void main(String[] args) {
//	Player player = new Player();
//	player.name = "GordonFreeman";
//	player.health = 20;
//	player.weapon = "Sword";
//
//	int damage = 10;
//	player.loseHealth(damage);
//	System.out.println("Remaining health = " + player.healthRemaining());
//
//     damage = 11;
//     player.health = 100;
//     player.loseHealth(damage);
//     System.out.println("Remaining health = " + player.healthRemaining());

//    }

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("LaraCroft", 100, "Pistols");
        enhancedPlayer.getHitpoints();
        int damage = 76;
        enhancedPlayer.loseHealth(damage);
        enhancedPlayer.loseHealth(damage);

//        System.out.println("NUMBRRR " + (int) Math.ceil(int i 7/2));

        Printer mynewPrinter = new Printer(0, 0, true);
        mynewPrinter.fillToner();
        mynewPrinter.printPages(7);
        mynewPrinter.printPages(108);
        mynewPrinter.printPages(7);


//        Printer myoldPrinter = new Printer(0, 0, false);
//        myoldPrinter.fillToner();
//        myoldPrinter.printPages(7);


    }
}

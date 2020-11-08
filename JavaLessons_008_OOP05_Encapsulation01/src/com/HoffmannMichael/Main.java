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

        Printer myPrinter = new Printer(0, 0, true);
        myPrinter.fillToner();
        myPrinter.printPages(7);



    }
}

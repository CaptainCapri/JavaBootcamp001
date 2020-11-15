package com.HoffmannMichael;


class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot(){
        return "no plot here";
    }
}

class MadMax extends Movie{
    public MadMax(){
        super("MadMax");
    }
    public String plot(){
        return "Shiny and Chrome";
    }
}

class FightClub extends Movie{
    public FightClub(){
        super("FightClub");
    }

    @Override
    public String plot(){
        return "Tyler Durden is Jack";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("StarWars");
    }

    @Override
    public String plot(){
        return "Lightsabres and Starships";
    }
}

class LionKing extends Movie{
    public LionKing(){
        super("LionKing");
    }

    @Override
    public String plot(){
        return "Simba becomes King";
    }
}

class ForgetableMovie extends Movie{
    public ForgetableMovie(){
        super("Forgetable Movie");
    }

//    no plot
}


public class Main {

    public static void main(String[] args) {
        for(int i=1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie # " + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }

	// write your code here
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("Random number is: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new FightClub();
            case 2:
                return new MadMax();
            case 3:
                return new StarWars();
            case 4:
                return new LionKing();
            case 5:
                return new ForgetableMovie();
        }

        return null;
    }


}

package jokerapp;

import java.util.Random;

public class Jokelist{
    //Jokelist
    private Joke[] list = {
        new Joke ("Joke 1"),
        new Joke ("Joke 2"),
        new Joke ("Joke 3")
    };

    //randomnumbergenerator
    private Random generator = new Random();

    //return the joke
    public Joke returnjoke(){
        return rdmJoke();
    }

    //get a random joke from list
    private Joke rdmJoke(){

        //get a random number
        int rdmnum = generator.nextInt(list.length);

        //get a random Joke from array
        return list[rdmnum];
    }
}
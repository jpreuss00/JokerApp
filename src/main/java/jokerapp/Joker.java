package jokerapp;

import jokerapp.Jokelist;

public class Joker{
    private Jokelist list = new Jokelist();

    //use Jokelist to get a random joke
    public void tellJoke(){
        Joke joke = list.returnjoke();

        ConsoleOutput window = new ConsoleOutput();
        window.output(joke);

        ColoredOutput colwindow = new ColoredOutput();
        colwindow.output(joke);
    }
}
package jokerapp;

import java.util.*;

import java.awt.Color;

public class ColoredOutput{
    //randomnumbergenerator
    private final Random generator = new Random();

    public void output(final Joke joke){
        final String randomcolor = getrdmcolor();
        System.out.println(randomcolor + joke.joke + ConsoleColors.RESET);
    }
    private String getrdmcolor(){
        final List <String> colors = Arrays.asList(
            ConsoleColors.RED,
            ConsoleColors.BLUE,
            ConsoleColors.GREEN,
            ConsoleColors.YELLOW,
            ConsoleColors.CYAN,
            ConsoleColors.RED_BRIGHT,
            ConsoleColors.BLUE_BRIGHT,
            ConsoleColors.GREEN_BRIGHT,
            ConsoleColors.YELLOW_BRIGHT,
            ConsoleColors.CYAN_BRIGHT
        );
        final int i = generator.nextInt(colors.size());
        return colors.get(i);
    }
}
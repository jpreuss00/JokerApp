package jokerapp;

import javax.swing.JOptionPane;

public class GuiOutput{
    
    public void output(Joke joke){
        JOptionPane.showMessageDialog(null,joke.joke);

    }
}
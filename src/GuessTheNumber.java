import javax.swing.*;

public class GuessTheNumber {
    public GuessTheNumber() {
        int number = (int)(Math.random()*100);
        int userGuess;
        int condition = 0;

        for(int i = 0; i < 5; i++) {
            userGuess = Integer.parseInt(JOptionPane.showInputDialog("Guess the number between 1 and 100! You have " + (5-i) + " attempts left!"));
            if(number == userGuess) {
                JOptionPane.showMessageDialog(null, "You've guessed the number correctly! You win!");
                condition = 1;
                break;
            } else if(number > userGuess && i != 4) {
                JOptionPane.showMessageDialog(null, "Try higher!");
            } else if(number < userGuess && i != 4) {
                JOptionPane.showMessageDialog(null, "Try lower!");
            }
        }

        if(condition == 0) {
            JOptionPane.showMessageDialog(null, "You ran out of attempts! You lose!");
        }
        ThanksForPlaying endgame = new ThanksForPlaying();
    }
}

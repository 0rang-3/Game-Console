import javax.swing.*;
public class main {
    public static void main(String[] args) {

        String[] playAgainButtons = {"List of Games"};
        JOptionPane.showOptionDialog(null, "Welcome to the Game Console!", "Game Console", JOptionPane.WARNING_MESSAGE, 0, null, playAgainButtons, playAgainButtons[0]);

        int choice = Integer.parseInt(JOptionPane.showInputDialog("To choose a game, please type the number next to the game.\n1. Game of Animals\n2. Rock Paper Scissors\n3. Lottery\n 4. Blackjack\n5. Guess the Number"));

        while(choice < 1 || choice > 5) {
            choice = Integer.parseInt(JOptionPane.showInputDialog("Please type a number that corresponds to the game that you want to play.\n1. Game of Animals\n2. Rock Paper Scissors\n3. Lottery\n4. Blackjack\n5. Guess the Number"));
            System.out.println(choice);
        }

        switch(choice) {
            case 1:
                GameOfAnimals game1 = new GameOfAnimals();
                break;
            case 2:
                RockPaperScissors game2 = new RockPaperScissors();
                break;
            case 3:
                Lottery game3 = new Lottery();
                break;
            case 4:
                Blackjack game4 = new Blackjack();
            case 5:
                GuessTheNumber game5 = new GuessTheNumber();
        }
    }
}

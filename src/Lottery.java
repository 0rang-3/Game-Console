import javax.swing.*;
public class Lottery {
    public Lottery() {
        int userNumber;
        int maxValue;
        int totalMoney = 0;
        int lotteryNumber = (int)(Math.random()*100);

        maxValue = Integer.parseInt(JOptionPane.showInputDialog("The objective of lottery is to get the most money. Please type how many rounds you want to play."));

        for(int i = 0; i<maxValue; i++) {
            userNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter a two-digit number."));
            int lotteryNumber1 = lotteryNumber/10;
            int lotteryNumber2 = lotteryNumber%10;
            int userNumber1 = userNumber/10;
            int userNumber2 = userNumber%10;
            if(lotteryNumber == userNumber) {
                JOptionPane.showMessageDialog(null, "Exact number: You won $10,000!");
                totalMoney = totalMoney + 10000;
            } else if(lotteryNumber1 == userNumber2 && lotteryNumber2 == userNumber1) {
                JOptionPane.showMessageDialog(null, "All the digits matched in reverse order. You won $3,000!");
                totalMoney = totalMoney + 3000;
            } else if(lotteryNumber1 == userNumber1 || lotteryNumber1 == userNumber2 || lotteryNumber2 == userNumber1 || lotteryNumber2 == userNumber2) {
                JOptionPane.showMessageDialog(null, "One of the digits matched. You won $1,000!");
                totalMoney = totalMoney + 1000;
            } else {
                JOptionPane.showMessageDialog(null, "None of the digits match. You lose!");
            }
        }
        JOptionPane.showMessageDialog(null, "You earned $" + totalMoney+"!");

        ThanksForPlaying endgame = new ThanksForPlaying();
    }
}

import javax.swing.*;

public class Blackjack {
    public Blackjack() {
        //VARIABLES
        int dealdown, dealup, playdown, playup, money;
        money = 100; //currency in "coins"
        int dealerDrawCondition = 0;

        //INTRODUCTION
        JOptionPane.showMessageDialog(null, "Hi player, ready to play some blackjack?");


        int condition = 0;
        while(condition == 0) {
            dealdown = (int) (Math.random()*(14-2)+2); //dealers face down
            dealup = (int) (Math.random()*(14-2)+2); //dealers face up
            playdown = (int) (Math.random()*(14-2)+2); //player face down
            playup = (int) (Math.random()*(14-2)+2); //player face up



            //BET MONEY
            int bet = Integer.parseInt(JOptionPane.showInputDialog("You have " + money + " coins. How many coins would you like to bet?"));
            while(bet > money || bet < 0) {
                if(bet > money) {
                    bet = Integer.parseInt(JOptionPane.showInputDialog("You cannot bet more money than you have. Place your bet again. You have " + money + " coins."));
                } else if(bet < 0) {
                    bet = Integer.parseInt(JOptionPane.showInputDialog("You cannot bet negative money. Place your bet again. You have " + money + " coins."));
                }
                    if (bet < money && bet > 0){
                break;
                }
            }

            //REVEALING DEALERS FACE UP CARD
            if (dealup <= 10) {
                JOptionPane.showMessageDialog(null, "The dealers face up card is a " + dealup + ".");
            } else if (dealup == 11) {
                JOptionPane.showMessageDialog(null, "The dealers face up card is a jack.");
            } else if (dealup == 12) {
                JOptionPane.showMessageDialog(null, "The dealers face up card is a queen.");
            } else if (dealup == 13) {
                JOptionPane.showMessageDialog(null, "The dealers face up card is a king.");
            } else {
                JOptionPane.showMessageDialog(null, "The dealers face up card is a ace.");
            }

            //REVEALING PLAYERS FACE UP CARD
            if (playup <= 10) {
                JOptionPane.showMessageDialog(null, "Your face up card is a " + playup + ".");
            } else if (playup == 11) {
                JOptionPane.showMessageDialog(null, "Your face up card is a jack.");
            } else if (playup == 12) {
                JOptionPane.showMessageDialog(null, "Your face up card is a queen.");
            } else if (playup == 13) {
                JOptionPane.showMessageDialog(null, "Your face up card is a king.");
            } else if (playup == 14) {
                JOptionPane.showMessageDialog(null, "Your face up card is a ace.");
            }
            //REVEALING PLAYERS FACE DOWN CARD
            if (playdown <= 10) {
                JOptionPane.showMessageDialog(null, "Your face down card is a " + playdown + ".");
            } else if (playdown == 11) {
                JOptionPane.showMessageDialog(null, "Your face down card is a jack.");
            } else if (playdown == 12) {
                JOptionPane.showMessageDialog(null, "Your face down card is a queen.");
            } else if (playdown == 13) {
                JOptionPane.showMessageDialog(null, "Your face down card is a king.");
            } else if (playdown == 14){
                JOptionPane.showMessageDialog(null, "Your face down card is a ace.");
            }

            //VARIABLES FOR ACTUAL VALUES
            if (dealup == 11 || dealup == 12 || dealup == 13) {
                dealup = 10;
            } else if (dealup == 14) {
                dealup = 11;
            }
            if (playup == 11 || playup == 12 || playup == 13) {
                playup = 10;
            } else if (playup == 14) {
                playup = 11;
            }
            if (playdown == 11 || playdown == 12 || playdown == 13) {
                playdown = 10;
            } else if (playdown == 14) {
                playdown = 11;
            }

            //ADD TOTAL VALUE OF PLAYERS CARDS
            int playtotal = playup + playdown;
            int dealtotal = dealup;
            JOptionPane.showMessageDialog(null, "Your total value is " + playtotal + ".");

            String[] hitOrStandButtons = {"Hit", "Stand"};
            int choice = JOptionPane.showOptionDialog(null, "Do you want to hit or stand?", "Hit or Stand", JOptionPane.WARNING_MESSAGE, 0, null, hitOrStandButtons, hitOrStandButtons);

            while(choice == 0) {
                int card = (int)(Math.random()*14+2);
                if (card <= 10) {
                    JOptionPane.showMessageDialog(null, "Your new card is a " + card + ".");
                } else if (card == 11) {
                    JOptionPane.showMessageDialog(null, "Your new card is a jack.");
                } else if (card == 12) {
                    JOptionPane.showMessageDialog(null, "Your new card is a queen.");
                } else if (card == 13) {
                    JOptionPane.showMessageDialog(null, "Your new card is a king.");
                } else if (card == 14) {
                    JOptionPane.showMessageDialog(null, "Your new card is a ace.");
                }

                if (card == 11 || card == 12 || card == 13) {
                    card = 10;
                } else if (card == 14) {
                    card = 11;
                }
                playtotal = playtotal + card;
                JOptionPane.showMessageDialog(null, "You total value is now " + playtotal + ".");
                if(playtotal > 21) {
                    JOptionPane.showMessageDialog(null, "You went over 21, you lost "+bet+" coins!");
                    money = money - bet;
                    dealerDrawCondition = 1;
                    break;
                } else {
                    choice = JOptionPane.showOptionDialog(null, "Do you want to hit or stand?", "Hit or Stand", JOptionPane.WARNING_MESSAGE, 0, null, hitOrStandButtons, hitOrStandButtons);
                    if(choice == 1) {
                        break;
                    }
                }
            }


            //DEALER DOWN CARD AND CHANGING TO VALUE UNITS
            if(dealerDrawCondition != 1) {
                if (dealdown <= 10) {
                    JOptionPane.showMessageDialog(null, "The dealers face down card is a " + dealdown + ".");
                } else if (dealdown == 11) {
                    JOptionPane.showMessageDialog(null, "The dealers face down card is a jack.");
                } else if (dealdown == 12) {
                    JOptionPane.showMessageDialog(null, "The dealers face down card is a queen.");
                } else if (dealdown == 13) {
                    JOptionPane.showMessageDialog(null, "The dealers face down card is a king.");
                } else {
                    JOptionPane.showMessageDialog(null, "The dealers face down card is a ace.");
                }
            if (dealdown == 11 || dealdown == 12 || dealdown == 13) {
                dealdown = 10;
            } else if (dealdown == 14) {
                dealdown = 11;
            }
            dealtotal = dealtotal + dealdown;
            JOptionPane.showMessageDialog(null, "The dealer's total is " + dealtotal + ".");
        }

            //DEALER HIT
            while(dealtotal < 17 && dealerDrawCondition == 0) {
                int dealcard = (int)(Math.random()*14+2);
                if (dealcard <= 10) {
                    JOptionPane.showMessageDialog(null, "The dealer drew a  " + dealcard + ".");
                } else if (dealcard == 11) {
                    JOptionPane.showMessageDialog(null, "The dealer drew a jack.");
                } else if (dealcard == 12) {
                    JOptionPane.showMessageDialog(null, "The dealer drew a queen.");
                } else if (dealcard == 13) {
                    JOptionPane.showMessageDialog(null, "The dealer drew a king.");
                } else {
                    JOptionPane.showMessageDialog(null, "The dealer drew an ace.");
                }

                if (dealcard == 11 || dealcard == 12 || dealcard == 13) {
                    dealcard = 10;
                } else if (dealcard == 14) {
                    dealcard = 11;
                }
                dealtotal = dealtotal + dealcard;
                JOptionPane.showMessageDialog(null, "The dealer's total is "+dealtotal+".");
            }

            //WIN CONDITIONS
            if(dealtotal > 21) {
                JOptionPane.showMessageDialog(null, "The dealer went over 21! You got " + bet + " this round!");
                money = money + bet;
            } else if (dealtotal > playtotal){
                JOptionPane.showMessageDialog(null, "You lost! You lost "+bet+" coins this round!");
                money = money - bet;
            } else if (playtotal > dealtotal && dealerDrawCondition != 1) {
                JOptionPane.showMessageDialog(null, "You win! You got "+ bet+" this round!");
                money = money + bet;
            } else if (playtotal == dealtotal){
                JOptionPane.showMessageDialog(null, "You and the dealer tied! You do not earn or lose any coins this round.");
            }

            //NO MONEY
            if(money == 0) {
                JOptionPane.showMessageDialog(null, "You ran out of money!");
                break;
            }

            //PLAY AGAIN
            String[] playAgainButtons = {"Yes", "No"};
            int playagain = JOptionPane.showOptionDialog(null, "Do you want to play again?", "Play Again", JOptionPane.WARNING_MESSAGE, 0, null, playAgainButtons, playAgainButtons[1]);
            while (playagain != 0 || playagain != 1){
                if (playagain == 0 || playagain ==1){
                    break;
                }
                playagain = Integer.parseInt(JOptionPane.showInputDialog("You didn't select either 1 or 0. Please select 0 for yes, or 1 for no"));
            }
            condition = playagain;
        }
        ThanksForPlaying endgame = new ThanksForPlaying();
    }
}


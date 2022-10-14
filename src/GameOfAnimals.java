import javax.swing.*;
public class GameOfAnimals {
    public GameOfAnimals()
    {
        String start;
        String userAnimalCata;
        int maxValue;
        int i; // This is for the for loop.
        int totalComputerScore=0;
        int totalUserScore=0;
        int userGuess;
        start = JOptionPane.showInputDialog("Welcome to Game of Animals. The objective of the game is to have more points than the computer and to level up as much as possible. Type view to view the animals.");
        if(start.equalsIgnoreCase("view"))
        {
            JOptionPane.showMessageDialog(null, "The different animals are:");
            JOptionPane.showMessageDialog(null, "Cat:\n Stage1 - House Cat\n Stage2 - Coyote\n Stage3 - Mountain Lion\n Stage4 - Black Panther\n Stage5 - Cheetah");
            JOptionPane.showMessageDialog(null, "Dog:\n Stage1 - House Dog\n Stage2 - Tame Hound\n Stage3 - Wid Hound\n Stage4 - Red Fox\n Stage5 - Gray Wolf");
            JOptionPane.showMessageDialog(null, "Fish:\n Stage1 - Goldfish\n Stage2 - Salmon\n Stage3 - Flying Fish\n Stage4 - Electric Eel\n Stage5 - Shark");
            JOptionPane.showMessageDialog(null, "Bird:\n Stage1 - Seagull\n Stage2 - Sparrow\n Stage3 - Parrot\n Stage4 - Harp Eagle\n Stage5 - Paragon Falcon");
            JOptionPane.showMessageDialog(null, "Snake:\n Stage1 - Snake\n Stage2 - Rattle Snake\n Stage3 - Viper\n Stage4 - Cobra\n Stage5 - King Cobra");
            JOptionPane.showMessageDialog(null, "Bear:\n Stage1 - Panda\n Stage2 - Cave Bear\n Stage3 - Black Bear\n Stage4 - Polar Bear\n Stage5 - Grizzly Bear");
            userAnimalCata = JOptionPane.showInputDialog("Type the animal category to continue (Eg. cat).");
            if(userAnimalCata.equalsIgnoreCase("cat"))
            {
                JOptionPane.showMessageDialog(null, "The computer chose: bear");
                maxValue = Integer.parseInt(JOptionPane.showInputDialog("How many rounds of guess the number do you want to play to earn points?"));
                for(i=1; i<=maxValue; i++)
                {
                    int guessTheNumber = (int)(10+Math.random()*100);
                    userGuess = Integer.parseInt(JOptionPane.showInputDialog("Enter a two digit number: "));
                    while(userGuess<10 || userGuess>99)
                    {
                        userGuess = Integer.parseInt(JOptionPane.showInputDialog("You didn't enter a two digit number. Enter a two digit number: "));
                    }
                    int computerGuess=(int)(10+Math.random()*100);
                    JOptionPane.showMessageDialog(null, "The computer guessed: "+computerGuess);
                    int guessTheNumber1 = guessTheNumber/10;
                    int guessTheNumber2 = guessTheNumber%10;
                    int userGuess1 = userGuess/10;
                    int userGuess2 = userGuess%10;
                    int computerGuess1 = computerGuess/10;
                    int computerGuess2 = computerGuess%10;
                    if(guessTheNumber==userGuess)
                    {
                        JOptionPane.showMessageDialog(null, "You get 15 points.");
                        totalUserScore=totalUserScore+15;
                    }
                    else if(guessTheNumber1==userGuess2 && guessTheNumber2==userGuess1)
                    {
                        JOptionPane.showMessageDialog(null, "You get 10 points.");
                        totalUserScore=totalUserScore+10;
                    }
                    else if(guessTheNumber1==userGuess1 || guessTheNumber1 == userGuess2 || guessTheNumber2 == userGuess1 || guessTheNumber2 == userGuess1)
                    {
                        JOptionPane.showMessageDialog(null, "You get 5 points.");
                        totalUserScore=totalUserScore+5;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"You get 0 points.");
                    }
                    if(guessTheNumber==computerGuess)
                    {
                        JOptionPane.showMessageDialog(null, "The computer gets 15 points.");
                        totalComputerScore=totalComputerScore+15;
                    }
                    else if(guessTheNumber1==computerGuess2 && guessTheNumber2==computerGuess1)
                    {
                        JOptionPane.showMessageDialog(null, "The computer gets 10 points.");
                        totalComputerScore=totalComputerScore+10;
                    }
                    else if(guessTheNumber1==computerGuess1 || guessTheNumber1 == computerGuess2 || guessTheNumber2 == computerGuess1 || guessTheNumber2 == computerGuess1)
                    {
                        JOptionPane.showMessageDialog(null, "The computer gets 5 points.");
                        totalComputerScore=totalComputerScore+5;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "The computer gets 0 points.");
                    }
                    if(totalUserScore<5)
                    {
                        JOptionPane.showMessageDialog(null, "You are at Stage 1 - House Cat.");
                    }
                    else if(totalUserScore>=5 && totalUserScore<15)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 2 - Coyote.");
                    }
                    else if(totalUserScore>=15 && totalUserScore<30)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 3 - Mountain Lion.");
                    }
                    else if(totalUserScore>=30 && totalUserScore<50)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 4 - Black Panther.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 5 - Cheetah.");
                    }
                    if(totalComputerScore<5)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 1 - Panda.");
                    }
                    else if(totalComputerScore>=5 && totalComputerScore<15)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 2 - Cave Bear.");
                    }
                    else if(totalComputerScore>=15 && totalComputerScore<30)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 3 - Black Bear.");
                    }
                    else if(totalComputerScore>=30 && totalComputerScore<50)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 4 - Polar Bear.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 5 - Grizzly Bear.");
                    }
                }
                if(totalComputerScore>totalUserScore)
                {
                    JOptionPane.showMessageDialog(null,"You lost. The computer won.");
                    JOptionPane.showMessageDialog(null, "Computer Score: "+totalComputerScore);
                    JOptionPane.showMessageDialog(null,"Your Score: "+totalUserScore);
                }
                else if(totalUserScore>totalComputerScore)
                {
                    JOptionPane.showMessageDialog(null,"You won.");
                    JOptionPane.showMessageDialog(null,"Computer Score: "+totalComputerScore);
                    JOptionPane.showMessageDialog(null,"Your Score: "+totalUserScore);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"It's a draw.");
                    JOptionPane.showMessageDialog(null,"Computer Score: "+totalComputerScore);
                    JOptionPane.showMessageDialog(null,"Your Score: "+totalUserScore);
                }
            }
            else if(userAnimalCata.equalsIgnoreCase("dog"))
            {
                JOptionPane.showMessageDialog(null,"The computer chose: cat");
                maxValue = Integer.parseInt(JOptionPane.showInputDialog("How many rounds of guess the number do you want to play to earn points?"));
                for(i=1; i<=maxValue; i++)
                {
                    int guessTheNumber = (int)(10+Math.random()*100);
                    userGuess = Integer.parseInt(JOptionPane.showInputDialog("Enter a two digit number: "));
                    while(userGuess<10 || userGuess>99)
                    {
                        userGuess = Integer.parseInt(JOptionPane.showInputDialog("You didn't enter a two digit number. Enter a two digit number: "));
                    }
                    int computerGuess=(int)(10+Math.random()*100);
                    JOptionPane.showMessageDialog(null,"The computer guessed: "+computerGuess);
                    int guessTheNumber1 = guessTheNumber/10;
                    int guessTheNumber2 = guessTheNumber%10;
                    int userGuess1 = userGuess/10;
                    int userGuess2 = userGuess%10;
                    int computerGuess1 = computerGuess/10;
                    int computerGuess2 = computerGuess%10;
                    if(guessTheNumber==userGuess)
                    {
                        JOptionPane.showMessageDialog(null,"You get 15 points.");
                        totalUserScore=totalUserScore+15;
                    }
                    else if(guessTheNumber1==userGuess2 && guessTheNumber2==userGuess1)
                    {
                        JOptionPane.showMessageDialog(null,"All the digits matched: You get 10 points.");
                        totalUserScore=totalUserScore+10;
                    }
                    else if(guessTheNumber1==userGuess1 || guessTheNumber1 == userGuess2 || guessTheNumber2 == userGuess1 || guessTheNumber2 == userGuess1)
                    {
                        JOptionPane.showMessageDialog(null,"One of the digits matched: You get 5 points.");
                        totalUserScore=totalUserScore+5;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"You get 0 points.");
                    }
                    if(guessTheNumber==computerGuess)
                    {
                        JOptionPane.showMessageDialog(null,"The computer gets 15 points.");
                        totalComputerScore=totalComputerScore+15;
                    }
                    else if(guessTheNumber1==computerGuess2 && guessTheNumber2==computerGuess1)
                    {
                        JOptionPane.showMessageDialog(null,"The computer gets 10 points.");
                        totalComputerScore=totalComputerScore+10;
                    }
                    else if(guessTheNumber1==computerGuess1 || guessTheNumber1 == computerGuess2 || guessTheNumber2 == computerGuess1 || guessTheNumber2 == computerGuess1)
                    {
                        JOptionPane.showMessageDialog(null,"The computer gets 5 points.");
                        totalComputerScore=totalComputerScore+5;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"The computer gets 0 points.");
                    }
                    if(totalUserScore<5)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 1 - House Dog.");
                    }
                    else if(totalUserScore>=5 && totalUserScore<15)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 2 - Tame Hound.");
                    }
                    else if(totalUserScore>=15 && totalUserScore<30)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 3 - Wild Hound.");
                    }
                    else if(totalUserScore>=30 && totalUserScore<50)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 4 - Red Fox.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 5 - Gray Wolf.");
                    }
                    if(totalComputerScore<5)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 1 - House Cat.");
                    }
                    else if(totalComputerScore>=5 && totalComputerScore<15)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 2 - Coyote.");
                    }
                    else if(totalComputerScore>=15 && totalComputerScore<30)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 3 - Mountain Lion.");
                    }
                    else if(totalComputerScore>=30 && totalComputerScore<50)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 4 - Black Panther.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 5 - Cheetah.");
                    }
                }
                if(totalComputerScore>totalUserScore)
                {
                    JOptionPane.showMessageDialog(null,"You lost. The computer won.");
                    JOptionPane.showMessageDialog(null,"Computer Score: "+totalComputerScore);
                    JOptionPane.showMessageDialog(null,"Your Score: "+totalUserScore);
                }
                else if(totalUserScore>totalComputerScore)
                {
                    JOptionPane.showMessageDialog(null,"You won.");
                    JOptionPane.showMessageDialog(null,"Computer Score: "+totalComputerScore);
                    JOptionPane.showMessageDialog(null,"Your Score: "+totalUserScore);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"It's a draw.");
                    JOptionPane.showMessageDialog(null,"Computer Score: "+totalComputerScore);
                    JOptionPane.showMessageDialog(null,"Your Score: "+totalUserScore);
                }
            }
            else if(userAnimalCata.equalsIgnoreCase("fish"))
            {
                JOptionPane.showMessageDialog(null,"The computer chose: snake");
                maxValue = Integer.parseInt(JOptionPane.showInputDialog("How many rounds of guess the number do you want to play to earn points?"));
                for(i=1; i<=maxValue; i++)
                {
                    int guessTheNumber = (int)(10+Math.random()*100);
                    userGuess = Integer.parseInt(JOptionPane.showInputDialog("Enter a two digit number: "));
                    while(userGuess<10 || userGuess>99)
                    {
                        userGuess = Integer.parseInt(JOptionPane.showInputDialog("You didn't enter a two digit number. Enter a two digit number: "));
                    }
                    int computerGuess=(int)(10+Math.random()*100);
                    JOptionPane.showMessageDialog(null,"The computer guessed: "+computerGuess);
                    int guessTheNumber1 = guessTheNumber/10;
                    int guessTheNumber2 = guessTheNumber%10;
                    int userGuess1 = userGuess/10;
                    int userGuess2 = userGuess%10;
                    int computerGuess1 = computerGuess/10;
                    int computerGuess2 = computerGuess%10;
                    if(guessTheNumber==userGuess)
                    {
                        JOptionPane.showMessageDialog(null,"You get 15 points.");
                        totalUserScore=totalUserScore+15;
                    }
                    else if(guessTheNumber1==userGuess2 && guessTheNumber2==userGuess1)
                    {
                        JOptionPane.showMessageDialog(null,"You get 10 points.");
                        totalUserScore=totalUserScore+10;
                    }
                    else if(guessTheNumber1==userGuess1 || guessTheNumber1 == userGuess2 || guessTheNumber2 == userGuess1 || guessTheNumber2 == userGuess1)
                    {
                        JOptionPane.showMessageDialog(null,"You get 5 points.");
                        totalUserScore=totalUserScore+5;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"You get 0 points.");
                    }
                    if(guessTheNumber==computerGuess)
                    {
                        JOptionPane.showMessageDialog(null,"The computer gets 15 points.");
                        totalComputerScore=totalComputerScore+15;
                    }
                    else if(guessTheNumber1==computerGuess2 && guessTheNumber2==computerGuess1)
                    {
                        JOptionPane.showMessageDialog(null,"The computer gets 10 points.");
                        totalComputerScore=totalComputerScore+10;
                    }
                    else if(guessTheNumber1==computerGuess1 || guessTheNumber1 == computerGuess2 || guessTheNumber2 == computerGuess1 || guessTheNumber2 == computerGuess1)
                    {
                        JOptionPane.showMessageDialog(null,"The computer gets 5 points.");
                        totalComputerScore=totalComputerScore+5;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"The computer gets 0 points.");
                    }
                    if(totalUserScore<5)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 1 - Goldfish.");
                    }
                    else if(totalUserScore>=5 && totalUserScore<15)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 2 - Salmon.");
                    }
                    else if(totalUserScore>=15 && totalUserScore<30)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 3 - Flying Fish.");
                    }
                    else if(totalUserScore>=30 && totalUserScore<50)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 4 - Electric Eel.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 5 - Shark.");
                    }
                    if(totalComputerScore<5)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 1 - Snake.");
                    }
                    else if(totalComputerScore>=5 && totalComputerScore<15)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 2 - Rattle Snake.");
                    }
                    else if(totalComputerScore>=15 && totalComputerScore<30)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 3 - Viper.");
                    }
                    else if(totalComputerScore>=30 && totalComputerScore<50)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 4 - Cobra.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 5 - King Cobra.");
                    }
                }
                if(totalComputerScore>totalUserScore)
                {
                    JOptionPane.showMessageDialog(null,"You lost. The computer won.");
                    JOptionPane.showMessageDialog(null,"Computer Score: "+totalComputerScore);
                    JOptionPane.showMessageDialog(null,"Your Score: "+totalUserScore);
                }
                else if(totalUserScore>totalComputerScore)
                {
                    JOptionPane.showMessageDialog(null,"You won.");
                    JOptionPane.showMessageDialog(null,"Computer Score: "+totalComputerScore);
                    JOptionPane.showMessageDialog(null,"Your Score: "+totalUserScore);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"It's a draw.");
                    JOptionPane.showMessageDialog(null,"Computer Score: "+totalComputerScore);
                    JOptionPane.showMessageDialog(null,"Your Score: "+totalUserScore);
                }
            }
            else if(userAnimalCata.equalsIgnoreCase("bird"))
            {
                JOptionPane.showMessageDialog(null,"The computer chose: dog");
                maxValue = Integer.parseInt(JOptionPane.showInputDialog("How many rounds of guess the number do you want to play to earn points?"));
                for(i=1; i<=maxValue; i++)
                {
                    int guessTheNumber = (int)(10+Math.random()*100);
                    userGuess = Integer.parseInt(JOptionPane.showInputDialog("Enter a two digit number: "));
                    while(userGuess<10 || userGuess>99)
                    {
                        userGuess = Integer.parseInt(JOptionPane.showInputDialog("You didn't enter a two digit number. Enter a two digit number: "));
                    }
                    int computerGuess=(int)(10+Math.random()*100);
                    JOptionPane.showMessageDialog(null,"The computer guessed: "+computerGuess);
                    int guessTheNumber1 = guessTheNumber/10;
                    int guessTheNumber2 = guessTheNumber%10;
                    int userGuess1 = userGuess/10;
                    int userGuess2 = userGuess%10;
                    int computerGuess1 = computerGuess/10;
                    int computerGuess2 = computerGuess%10;
                    if(guessTheNumber==userGuess)
                    {
                        JOptionPane.showMessageDialog(null,"You get 15 points.");
                        totalUserScore=totalUserScore+15;
                    }
                    else if(guessTheNumber1==userGuess2 && guessTheNumber2==userGuess1)
                    {
                        JOptionPane.showMessageDialog(null,"You get 10 points.");
                        totalUserScore=totalUserScore+10;
                    }
                    else if(guessTheNumber1==userGuess1 || guessTheNumber1 == userGuess2 || guessTheNumber2 == userGuess1 || guessTheNumber2 == userGuess1)
                    {
                        JOptionPane.showMessageDialog(null,"You get 5 points.");
                        totalUserScore=totalUserScore+5;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"You get 0 points.");
                    }
                    if(guessTheNumber==computerGuess)
                    {
                        JOptionPane.showMessageDialog(null,"The computer gets 15 points.");
                        totalComputerScore=totalComputerScore+15;
                    }
                    else if(guessTheNumber1==computerGuess2 && guessTheNumber2==computerGuess1)
                    {
                        JOptionPane.showMessageDialog(null,"The computer gets 10 points.");
                        totalComputerScore=totalComputerScore+10;
                    }
                    else if(guessTheNumber1==computerGuess1 || guessTheNumber1 == computerGuess2 || guessTheNumber2 == computerGuess1 || guessTheNumber2 == computerGuess1)
                    {
                        JOptionPane.showMessageDialog(null,"The computer gets 5 points.");
                        totalComputerScore=totalComputerScore+5;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"The computer gets 0 points.");
                    }
                    if(totalUserScore<5)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 1 - Seagull.");
                    }
                    else if(totalUserScore>=5 && totalUserScore<15)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 2 - Sparrow.");
                    }
                    else if(totalUserScore>=15 && totalUserScore<30)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 3 - Parrot.");
                    }
                    else if(totalUserScore>=30 && totalUserScore<50)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 4 - Harp Eagle.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 5 - Paragon Falcon.");
                    }
                    if(totalComputerScore<5)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 1 - House Dog.");
                    }
                    else if(totalComputerScore>=5 && totalComputerScore<15)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 2 - Tame Hound.");
                    }
                    else if(totalComputerScore>=15 && totalComputerScore<30)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 3 - Wild Hound.");
                    }
                    else if(totalComputerScore>=30 && totalComputerScore<50)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 4 - Red Fox.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 5 - Wolf.");
                    }
                }
                if(totalComputerScore>totalUserScore)
                {
                    JOptionPane.showMessageDialog(null,"You lost. The computer won.");
                    JOptionPane.showMessageDialog(null,"Computer Score: "+totalComputerScore);
                    JOptionPane.showMessageDialog(null,"Your Score: "+totalUserScore);
                }
                else if(totalUserScore>totalComputerScore)
                {
                    JOptionPane.showMessageDialog(null,"You won.");
                    JOptionPane.showMessageDialog(null,"Computer Score: "+totalComputerScore);
                    JOptionPane.showMessageDialog(null,"Your Score: "+totalUserScore);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"It's a draw.");
                    JOptionPane.showMessageDialog(null,"Computer Score: "+totalComputerScore);
                    JOptionPane.showMessageDialog(null,"Your Score: "+totalUserScore);
                }
            }
            else if(userAnimalCata.equalsIgnoreCase("snake"))
            {
                JOptionPane.showMessageDialog(null,"The computer chose: bird");
                maxValue = Integer.parseInt(JOptionPane.showInputDialog("How many rounds of guess the number do you want to play to earn points?"));
                for(i=1; i<=maxValue; i++)
                {
                    int guessTheNumber = (int)(10+Math.random()*100);
                    userGuess = Integer.parseInt(JOptionPane.showInputDialog("Enter a two digit number: "));
                    while(userGuess<10 || userGuess>99)
                    {
                        userGuess = Integer.parseInt(JOptionPane.showInputDialog("You didn't enter a two digit number. Enter a two digit number: "));
                    }
                    int computerGuess=(int)(10+Math.random()*100);
                    JOptionPane.showMessageDialog(null,"The computer guessed: "+computerGuess);
                    int guessTheNumber1 = guessTheNumber/10;
                    int guessTheNumber2 = guessTheNumber%10;
                    int userGuess1 = userGuess/10;
                    int userGuess2 = userGuess%10;
                    int computerGuess1 = computerGuess/10;
                    int computerGuess2 = computerGuess%10;
                    if(guessTheNumber==userGuess)
                    {
                        JOptionPane.showMessageDialog(null,"You get 15 points.");
                        totalUserScore=totalUserScore+15;
                    }
                    else if(guessTheNumber1==userGuess2 && guessTheNumber2==userGuess1)
                    {
                        JOptionPane.showMessageDialog(null,"You get 10 points.");
                        totalUserScore=totalUserScore+10;
                    }
                    else if(guessTheNumber1==userGuess1 || guessTheNumber1 == userGuess2 || guessTheNumber2 == userGuess1 || guessTheNumber2 == userGuess1)
                    {
                        JOptionPane.showMessageDialog(null,"You get 5 points.");
                        totalUserScore=totalUserScore+5;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"You get 0 points.");
                    }
                    if(guessTheNumber==computerGuess)
                    {
                        JOptionPane.showMessageDialog(null,"The computer gets 15 points.");
                        totalComputerScore=totalComputerScore+15;
                    }
                    else if(guessTheNumber1==computerGuess2 && guessTheNumber2==computerGuess1)
                    {
                        JOptionPane.showMessageDialog(null,"The computer gets 10 points.");
                        totalComputerScore=totalComputerScore+10;
                    }
                    else if(guessTheNumber1==computerGuess1 || guessTheNumber1 == computerGuess2 || guessTheNumber2 == computerGuess1 || guessTheNumber2 == computerGuess1)
                    {
                        JOptionPane.showMessageDialog(null,"The computer gets 5 points.");
                        totalComputerScore=totalComputerScore+5;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"The computer gets 0 points.");
                    }
                    if(totalUserScore<5)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 1.");
                    }
                    else if(totalUserScore>=5 && totalUserScore<15)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 2.");
                    }
                    else if(totalUserScore>=15 && totalUserScore<30)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 3.");
                    }
                    else if(totalUserScore>=30 && totalUserScore<50)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 4.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 5.");
                    }
                    if(totalComputerScore<5)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 1 - Seagull.");
                    }
                    else if(totalComputerScore>=5 && totalComputerScore<15)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 2 - Sparrow.");
                    }
                    else if(totalComputerScore>=15 && totalComputerScore<30)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 3 - Parrot.");
                    }
                    else if(totalComputerScore>=30 && totalComputerScore<50)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 4 - Harp Eagle.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 5 - Paragon Falcon.");
                    }
                }
                if(totalComputerScore>totalUserScore)
                {
                    JOptionPane.showMessageDialog(null,"You lost. The computer won.");
                    JOptionPane.showMessageDialog(null,"Computer Score: "+totalComputerScore);
                    JOptionPane.showMessageDialog(null,"Your Score: "+totalUserScore);
                }
                else if(totalUserScore>totalComputerScore)
                {
                    JOptionPane.showMessageDialog(null,"You won.");
                    JOptionPane.showMessageDialog(null,"Computer Score: "+totalComputerScore);
                    JOptionPane.showMessageDialog(null,"Your Score: "+totalUserScore);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"It's a draw.");
                    JOptionPane.showMessageDialog(null,"Computer Score: "+totalComputerScore);
                    JOptionPane.showMessageDialog(null,"Your Score: "+totalUserScore);
                }
            }
            else if(userAnimalCata.equalsIgnoreCase("bear"))
            {
                JOptionPane.showMessageDialog(null,"The computer chose: fish");
                maxValue = Integer.parseInt(JOptionPane.showInputDialog("How many rounds of guess the number do you want to play to earn points?"));
                for(i=1; i<=maxValue; i++)
                {
                    int guessTheNumber = (int)(10+Math.random()*100);
                    userGuess = Integer.parseInt(JOptionPane.showInputDialog("Enter a two digit number: "));
                    while(userGuess<10 || userGuess>99)
                    {
                        userGuess = Integer.parseInt(JOptionPane.showInputDialog("You didn't enter a two digit number. Enter a two digit number: "));
                    }
                    int computerGuess=(int)(10+Math.random()*100);
                    JOptionPane.showMessageDialog(null,"The computer guessed: "+computerGuess);
                    int guessTheNumber1 = guessTheNumber/10;
                    int guessTheNumber2 = guessTheNumber%10;
                    int userGuess1 = userGuess/10;
                    int userGuess2 = userGuess%10;
                    int computerGuess1 = computerGuess/10;
                    int computerGuess2 = computerGuess%10;
                    if(guessTheNumber==userGuess)
                    {
                        JOptionPane.showMessageDialog(null,"You get 15 points.");
                        totalUserScore=totalUserScore+15;
                    }
                    else if(guessTheNumber1==userGuess2 && guessTheNumber2==userGuess1)
                    {
                        JOptionPane.showMessageDialog(null,"You get 10 points.");
                        totalUserScore=totalUserScore+10;
                    }
                    else if(guessTheNumber1==userGuess1 || guessTheNumber1 == userGuess2 || guessTheNumber2 == userGuess1 || guessTheNumber2 == userGuess1)
                    {
                        JOptionPane.showMessageDialog(null,"You get 5 points.");
                        totalUserScore=totalUserScore+5;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"You get 0 points.");
                    }
                    if(guessTheNumber==computerGuess)
                    {
                        JOptionPane.showMessageDialog(null,"The computer gets 15 points.");
                        totalComputerScore=totalComputerScore+15;
                    }
                    else if(guessTheNumber1==computerGuess2 && guessTheNumber2==computerGuess1)
                    {
                        JOptionPane.showMessageDialog(null,"The computer gets 10 points.");
                        totalComputerScore=totalComputerScore+10;
                    }
                    else if(guessTheNumber1==computerGuess1 || guessTheNumber1 == computerGuess2 || guessTheNumber2 == computerGuess1 || guessTheNumber2 == computerGuess1)
                    {
                        JOptionPane.showMessageDialog(null,"The computer gets 5 points.");
                        totalComputerScore=totalComputerScore+5;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"The computer gets 0 points.");
                    }
                    if(totalUserScore<5)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 1 - Panda.");
                    }
                    else if(totalUserScore>=5 && totalUserScore<15)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 2 - Cave Bear.");
                    }
                    else if(totalUserScore>=15 && totalUserScore<30)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 3 - Black Bear.");
                    }
                    else if(totalUserScore>=30 && totalUserScore<50)
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 4 - Polar Bear.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"You are at Stage 5 - Grizzly Bear.");
                    }
                    if(totalComputerScore<5)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 1 - Goldfish.");
                    }
                    else if(totalComputerScore>=5 && totalComputerScore<15)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 2 - Salmon.");
                    }
                    else if(totalComputerScore>=15 && totalComputerScore<30)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 3 - Flying Fish.");
                    }
                    else if(totalComputerScore>=30 && totalComputerScore<50)
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 4 - Electric Eel.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"The computer is at Stage 5 - Shark.");
                    }
                }
                if(totalComputerScore>totalUserScore)
                {
                    JOptionPane.showMessageDialog(null,"You lost. The computer won.");
                    JOptionPane.showMessageDialog(null,"Computer Score: "+totalComputerScore);
                    JOptionPane.showMessageDialog(null,"Your Score: "+totalUserScore);
                }
                else if(totalUserScore>totalComputerScore)
                {
                    JOptionPane.showMessageDialog(null,"You won.");
                    JOptionPane.showMessageDialog(null,"Computer Score: "+totalComputerScore);
                    JOptionPane.showMessageDialog(null,"Your Score: "+totalUserScore);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"It's a draw.");
                    JOptionPane.showMessageDialog(null,"Computer Score: "+totalComputerScore);
                    JOptionPane.showMessageDialog(null,"Your Score: "+totalUserScore);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"You did something wrong...Run the program again.");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"You did something wrong...Run the program again.");
        }
    }
}
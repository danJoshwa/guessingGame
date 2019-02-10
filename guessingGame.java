/**
 * Write a description of class guessingGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.util.Random;

public class guessingGame
{

    public static void main(String args[])
    {
        String playAgain;
        Random rnd = new Random(); //random
        while (1==1)
        {
            
            int n1 = 1+rnd.nextInt(10);
            
            //String playAgain;

            Scanner scan = new Scanner(System.in);
            Scanner scan1 = new Scanner(System.in);
            System.out.println("This is the one and only guessing game");
            System.out.println("Please guess a number between 1 and 10");

            
            
            int guessInt = scan.nextInt();
            
            if (guessInt == n1)
            {
                System.out.println("Your guess was correct");
                System.out.println("Would you like to play again? (Y/N)");
            }
            else
            {
                System.out.println("Your guess wasn't correct");
                System.out.println("Would you like to play agian? (Y/N)");
            }
            playAgain = scan1.next();
            if (playAgain.equals("N") || playAgain.equals("n"))
            {
                System.exit(0);
            }
        }
    }
}

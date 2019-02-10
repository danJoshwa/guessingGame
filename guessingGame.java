/**
 * guessingGame
 * This program is a simple game where the user tries to guess a random number between 1 and 10
 * @Dan Joshwa 
 */
import java.util.*;
import java.util.Random;

public class guessingGame
{

    public static void main(String args[])
    {
        String playAgain;//this variable decides whether the player plays again or not
        Random rnd = new Random(); //how random numbers are made
        while (1==1)//infinite loop
        {
            
            int n1 = 1+rnd.nextInt(10);//this is the computer's random number
            
            //String playAgain;

            Scanner scan = new Scanner(System.in);//this gets user inputs
            System.out.println("This is the one and only guessing game");//infor for user
            System.out.println("Please guess a number between 1 and 10");

            
            
            int guessInt = scan.nextInt();//user guess
            
            if (guessInt == n1)//if the guess is right
            {
                System.out.println("Your guess was correct");
                System.out.println("Would you like to play again? (Y/N)");
            }
            else//otherwise
            {
                System.out.println("Your guess wasn't correct");
                System.out.println("Would you like to play agian? (Y/N)");
            }
            playAgain = scan.next();//whether the user wants to play again or not
            if (playAgain.equals("N") || playAgain.equals("n"))//if not
            {
                System.exit(0);//cut the program
            }
        }
    }
}

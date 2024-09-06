import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame 
{

    public static void main(String[] args) 
    {
        // Game settings
        int minNumber = 1;
        int maxNumber = 100;
        int maxGuesses = 10;

        // Game initialization
        Random random = new Random();
        int targetNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
        Scanner scanner = new Scanner(System.in);
        int guessCount = 0;

        // Welcome message
        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I'm thinking of a number between " + minNumber + " and " + maxNumber + ". You have " + maxGuesses + " guesses to get it right.");

        // Guessing loop
        while (guessCount < maxGuesses) 
        {
            guessCount++;
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            // Check guess and provide feedback
            if (guess < minNumber || guess > maxNumber) 
            {
                System.out.println("Invalid guess. Please enter a number within the specified range.");
            } else if (guess < targetNumber) 
            {
                System.out.println("Too low! Try a higher number.");
            } else if (guess > targetNumber) 
            {
                System.out.println("Too high! Try a lower number.");
            } else 
            {
                // Correct guess!
                System.out.println("Congratulations! You guessed the number in " + guessCount + " guesses!");
                break;
            }
        }

        // Game over message
        if (guessCount == maxGuesses) 
        {
            System.out.println("Sorry, you ran out of guesses. The number was " + targetNumber + ".");
        }
    }
}
import java.util.*;

public class GuessingGame {
    public static final int MIN = 1;
    public static final int MAX = 100;

    public static void main(String[] args) {
        // Create a console for the user to enter input
        Scanner console = new Scanner(System.in);

        // Create a random number for the user to guess.
        Random rand = new Random();
        int number = rand.nextInt(MAX - MIN + 1) + MIN;

        // Get the first guess from the user
        int guess = getInt(console, MIN, MAX);

        // Keep track of the number of guesses
        int count = 1;

        // Keep guessing until the user guesses the corret number
        while (number != guess) {
            if (guess > number) {
                System.out.println("Too High");
            } else {
                System.out.println("Too Low");
            }

            guess = getInt(console, MIN, MAX);
            count++;
        }

        // You Guessed the right number!
        System.out.println("Good Job! You guessed the correct number of " + guess + " in " + count + " guesses.");

    }

    // Gets an integer between min and max from the user
    public static int getInt(Scanner console, int min, int max) {
        // Get the first number from the user
        int guess = getInt(console, "Guess a number between " + min + " and " + max + ": ");

        // Keep getting guesses until the users enters a valid number
        while (guess < min || guess > max) {
            guess = getInt(console, "Please enter a number between " + min + " and " + max + ": ");
        }

        return guess;
    }

    // Get an integer from the user
    public static int getInt(Scanner console, String message) {
        System.out.print(message);

        while (!console.hasNextInt()) {
            console.next();
            System.out.print("Please enter a valid integer: ");
        }

        return console.nextInt();
    }
}
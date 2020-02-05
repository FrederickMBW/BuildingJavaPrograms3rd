import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        // Create a random number generator and console
        Scanner console = new Scanner(System.in);
        Random rand = new Random();

        // Print the welcome message
        welcomeMessage();

        // Create a boolean to keep track if a correct guess has been made
        boolean correct = false;

        // Create a counter to keep track of the number of guesses
        int count = 0;

        // Create random guess and check if they are correct
        int guess;

        do {
            guess = rand.nextInt(10) + 1;
            correct = isCorrectGuess(console, guess);
            count++;
        } while (!correct);

        // Print the exit message
        System.out.println("I got your number of " + guess + " in " + count + " guesses");
    }

    // Prints the welcome message to the game to the console
    public static void welcomeMessage() {
        System.out.println("This program has you, the user, choose a numnber");
        System.out.println("between 1 and 10. Then I, the computer, will try");
        System.out.println("my best to guess it");
    }

    // Returns true if the guess is correct
    // Returns false otherwise
    public static boolean isCorrectGuess(Scanner console, int guess) {
        System.out.print("It it " + guess + "? (y/n) ");

        String response = console.next();

        while (!response.equals("y") && !response.equals("n")) {
            System.out.print("Please enter 'y' or n': ");
            response = console.next();
        }

        if (response.equals("y")) {
            return true;
        } else {
            return false;
        }
    }
}
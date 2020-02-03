import java.util.*;

public class MakeGuesses {
    public static void main(String[] args) {
        makeGuesses();
    }

    public static void makeGuesses() {
        // Create a random number generator
        Random rand = new Random();

        // Create the counter
        int count = 1;

        // Create the first random number
        int next = rand.nextInt(50) + 1;

        // Keep guessing until guessing a number above 47
        while (next < 48) {
            System.out.println("Guess = " + next);
            next = rand.nextInt(50) + 1;
            count++;
        }

        // Print the last guess
        System.out.println("Guess = " + next);

        // Print the total number of guesses
        System.out.println("Total guesses = " + count);
    }
}
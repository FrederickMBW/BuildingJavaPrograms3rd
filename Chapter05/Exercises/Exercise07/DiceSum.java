import java.util.*;

public class DiceSum {
    public static final int MIN_ROLL = 2;
    public static final int MAX_ROLL = 12;

    public static void main(String[] args) {
        // Create a scanner
        Scanner console = new Scanner(System.in);

        // Run diceSum
        diceSum(console);
    }

    public static void diceSum(Scanner console) {
        // Get an integer betwee 2 and 12 from the user
        int roll = getInt(console, MIN_ROLL, MAX_ROLL);

        // Roll the dice until getting a number between 2 and 12
        rollDice(roll);
    }

    // Rolls two dice until rolling the number n
    public static void rollDice(int n) {
        if (n < MIN_ROLL || n > MAX_ROLL) {
            throw new IllegalArgumentException();
        }

        // Create a random number generator for the dice
        Random rand = new Random();

        // Pre-roll the two dice
        int die1 = 0;
        int die2 = 0;

        // Roll the two dice until rolling n
        while (die1 + die2 != n) {
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            System.out.println(die1 + " and " + die2 + " = " + (die1 + die2));
        }
    }

    // Gets an integer between min and max from the user
    public static int getInt(Scanner console, int min, int max) {
        // Get the first number from the user
        int guess = getInt(console, "Desired dice sum: ");

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
import java.util.*;

public class Mastermind {
    public static final int MIN = 1000;
    public static final int MAX = 9999;
    public static void main(String[] args) {
        // Create a console for user input
        Scanner console = new Scanner(System.in);

        // Create a random 4 digit number
        Random rand = new Random();
        int number = rand.nextInt(MAX - MIN + 1) + MIN;

        // Play Mastermind
        playMastermind(number, console);
    }

    // Play mastermind
    public static void playMastermind(int number, Scanner console) {
        // Get the first guess
        int guess = getGuess(console);

        // Keep playing until guessing correctly
        while (guess != number) {
            // Get the number of matching digits
            System.out.printf("%d digits correct\n", getMatchingDigitCount(number, guess));

            // Get the number of matching digits in the correct place
            System.out.printf("%d in the correct place\n", getDigitsInSamePositionCount(number, guess));

            // Get the next guess
            guess = getGuess(console);
        }

        // Print the ending Message
        System.out.printf("You guessed %d correctly!\n", number);
    }

    // Returns the number of matching digits in the same position
    public static int getDigitsInSamePositionCount(int n1, int n2) {
        int count = 0;

        while (n1 > 0 && n2 > 0) {
            if (n1 % 10 == n2 % 10) {
                count++;
            }
            n1 /= 10;
            n2 /= 10;
        }

        return count;
    }

    // Returns the number of matching digits
    public static int getMatchingDigitCount(int n1, int n2) {
        // Count the number of occurances of each digit
        int[] digitCount1 = getDigitCounts(n1);
        int[] digitCount2 = getDigitCounts(n2);

        // Find the total number of matching digits
        int sum = 0;
        for (int i = 0; i < digitCount1.length; i++) {
            sum += Math.min(digitCount1[i], digitCount2[i]);
        }

        return sum;
    }

    // Takes an integer and returns an array with the number of 
    // instances of each digit
    public static int[] getDigitCounts(int number) {
        int[] counts = new int[10];

        while (number > 0) {
            counts[number % 10]++;
            number /= 10;
        }

        return counts;
    }

    // Gets a guess from the user
    public static int getGuess(Scanner console) {
        System.out.printf("Make a guess between %d and %d: ", MIN, MAX);

        int guess = getInt(console);

        while (guess < MIN || guess > MAX) {
            System.out.printf("Integer must be between %d and %d: ", MIN, MAX);
            guess = getInt(console);
        }

        return guess;
    }

    // Get an integer from the user
    public static int getInt(Scanner console) {
        while (!console.hasNextInt()) {
            System.out.print("Please enter a valid integer: ");
            console.next();
        }

        return console.nextInt();
    }
}
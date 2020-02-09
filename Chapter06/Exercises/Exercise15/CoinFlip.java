import java.util.*;
import java.io.*;

public class CoinFlip {
    public static void main(String[] args) throws FileNotFoundException {
        // Create a scanner from the file name given from the command line
        Scanner input = new Scanner(new File(args[0]));

        // Run the coin flip method
        coinFlip(input);
    }

    // Goes through every line and outputs the number and percentage of heads in the
    // lines
    public static void coinFlip(Scanner input) {
        // Go through every line of the scanner
        while (input.hasNextLine()) {
            coinFlip(input.nextLine());
        }
    }

    // Goes through a line and outputs the number and percentage of heads in that
    // line
    // Assumes valid input
    public static void coinFlip(String input) {
        // Create a scanner from the line
        Scanner line = new Scanner(input);

        // Create counters to keep track of the number of heads and tails
        int heads = 0;
        int tails = 0;

        // Go through each token and add it to heads or tails count
        while (line.hasNext()) {
            char next = Character.toUpperCase(line.next().charAt(0));

            if (next == 'H') {
                heads++;
            } else {
                tails++;
            }
        }

        // Throw an exception if no coin flips in the string
        if (heads + tails == 0) {
            throw new IllegalArgumentException();
        }

        // Calculate the percentage of heads flipped
        double percentHeads = 100.0 * heads / (heads + tails);

        // Print out the number and percent of heads to the terminal
        System.out.printf("%d heads (%.1f%%)\n", heads, percentHeads);

        // Determine if the user won or lost and print that to the terminal
        if (heads > tails) {
            System.out.println("You win!\n");
        } else {
            System.out.println("");
        }
    }
}
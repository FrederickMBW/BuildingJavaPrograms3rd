import java.util.*;
import java.io.*;

public class InputState {
    public static void main(String[] args) throws FileNotFoundException {
        // Get the file name from the command line argument and create a scanner with it
        Scanner input = new Scanner(new File(args[0]));

        // Runs the stats required for Chapter 06 exercise 17
        inputState(input);
    }

    // Prints the input state for all the lines
    public static void inputState(Scanner input) {
        // Keep track of the longest line, its length, and the current line number
        int longestLineLength = 0;
        String longestLine = "";
        int lineNumber = 1;

        while (input.hasNextLine()) {
            String next = input.nextLine();

            // Update the longest line if the current line is longer
            if (next.length() > longestLineLength) {
                longestLineLength = next.length();
                longestLine = next;
            }

            // Print the stats for individual lines
            inputState(next, lineNumber++);
        }

        // Print the overall stats to the terminal
        System.out.printf("Longest line: %s\n", longestLine);
    }

    // Prints the input state for an individual line
    public static void inputState(String line, int lineNumber) {
        // Create a scanner to go through the line
        Scanner input = new Scanner(line);

        // Keep track of the number of tokens
        int tokens = 0;
        int longest = 0;

        // Calculate the input stats for the line
        while (input.hasNext()) {
            tokens++;

            String next = input.next();

            if (next.length() > longest) {
                longest = next.length();
            }
        }

        // Print the stats to the terminal
        System.out.printf("Line %d has %d tokens (longest = %d)\n", lineNumber, tokens, longest);
    }
}
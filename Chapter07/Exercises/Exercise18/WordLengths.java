// Tested on Practice it
// https://practiceit.cs.washington.edu/\

import java.util.*;

public class WordLengths {
    // Prints to the command line how many tokens of every length apprears in the scanner
    // Can assume no tokens are longer than 80 charactors long
    public static void wordLengths(Scanner input) {
        // Get the counts
        int[] counts = getTokenCounts(input);

        // Print the counts
        printWordCounts(counts);
    }

    // Returns an array representing how many tokens of every length apprear in the scanner
    public static int[] getTokenCounts(Scanner input) {
        // Create the resulting array
        int[] result = new int[81];

        // Go through every token and add it's length to the result
        while (input.hasNext()) {
            result[input.next().length()]++;
        } 

        // Return the counts
        return result;
    }

    // Prints the counts how it was requested in the text book
    // Update, print based on how the website wants it
    public static void printWordCounts(int[] counts) {
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.printf("%d: %d\t", i, counts[i]);
                printChar('*', counts[i]);
                System.out.println();
            }
        }
    }

    // Prints a character n times
    public static void printChar(char c, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
}
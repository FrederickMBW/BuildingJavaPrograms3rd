import java.util.*;
import java.io.*;

public class PlusScores {
    public static void main(String[] args) throws FileNotFoundException {
        // Get the file name from the command line and create a scanner from it
        Scanner input = new Scanner(new File(args[0]));

        // Create the output required for Chapter 06 Exercise 18
        plusScores(input);
    }

    // Exercise 18
    // Assumes valid input
    public static void plusScores(Scanner input) {
        while (input.hasNextLine()) {
            System.out.print(input.nextLine() + ": ");
            System.out.printf("%.1f%% plus\n", percentagePlust(input.nextLine().trim()));
        }
    }

    // Returns the percentage of '+' in a String
    public static double percentagePlust(String s) {
        if (s.length() == 0) {
            throw new IllegalArgumentException();
        }

        // Countthe number of '+'
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+') {
                count++;
            }
        }

        // Return the percentage of '+' in the string
        return 100.0 * count / s.length();
    }
}
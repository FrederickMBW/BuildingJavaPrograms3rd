import java.util.*;
import java.io.*;

public class MostCommonNames {
    public static void main(String[] args) throws FileNotFoundException {
        // Get the file name from the command line and create a scanner from it
        Scanner input = new Scanner(new File(args[0]));

        // Find the most common word used in each line
        mostCommonNames(input);
    }

    // Finds the most common word used in each line
    public static void mostCommonNames(Scanner input) {
        while (input.hasNextLine()) {
            // Find the most common word used on a single line
            mostCommonNames(input.nextLine());
        }
    }

    // Find the most common word used on a single line
    // I am going to assume valid input
    public static void mostCommonNames(String input) {
        // Create a scanner from the input to go through every token
        Scanner names = new Scanner(input);

        // Throw an exception if no names in input
        if (!names.hasNext()) {
            throw new IllegalArgumentException();
        }

        // Get the number of times the first names occurs
        String mostCommonName = names.next();
        int maxCount = nameOccurances(mostCommonName, input);

        // Go through every name in the input and count how many times it appears
        // If it appears more than any previous name, update the most common name and
        // max count
        while (names.hasNext()) {
            String next = names.next();
            int count = nameOccurances(next, input);

            if (count > maxCount) {
                maxCount = count;
                mostCommonName = next;
            }
        }

        System.out.println("Most common: " + mostCommonName);
    }

    // Get the number of times a name appears on a line
    // Case Sensitive
    public static int nameOccurances(String name, String input) {
        // Create a scanner to go through all the names in the input
        Scanner names = new Scanner(input);

        // Create a count to keep track of the number of times the name appears
        int count = 0;

        // Count the number of times the name appears
        while (names.hasNext()) {
            String next = names.next();
            if (next.equals(name)) {
                count++;
            }
        }

        return count;
    }
}
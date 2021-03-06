import java.io.*;
import java.util.*;

// I use this class to create a file
public class CreateFile {
    public static void main(String[] args) throws FileNotFoundException {
        // Create a random number generator
        Random rand = new Random();

        // Get the file name from the command line
        String fileName = args[0];

        // Create the output file
        PrintStream output = new PrintStream(new File(fileName));

        // Decide the number of lines to write to the file
        int lines = rand.nextInt(90) + 11;

        // Print the all lines to the output
        for (int i = 0; i < lines; i++) {
            // Decide the number of characters in the line
            int letters = rand.nextInt(1000);
            for (int j = 0; j < letters; j++) {
                char nextLetter = (char) (rand.nextInt(26) + 'a');
                output.print(nextLetter);
            }
            output.println();
        }
    }
}
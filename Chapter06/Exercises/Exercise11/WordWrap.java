import java.io.*;
import java.util.*;

public class WordWrap {
    public static final int MAX_LENGTH = 60;

    public static void main(String[] args) throws FileNotFoundException {
        // Get the file name from the command line and create the file
        File file = new File(args[0]);

        // Test the method on a single line
        wordWrap(file);
    }

    // Takes a file and word wraps it
    public static void wordWrap(File file) throws FileNotFoundException {
        // Convert the file into a String and create a scanner from it
        Scanner input = new Scanner(convertFileToString(file));

        // Write the string back to the file
        PrintStream output = new PrintStream(file);

        while (input.hasNextLine()) {
            String next = input.nextLine();
            outputLine(next, output);
        }
    }

    // Takes a file and returns it as a String
    public static String convertFileToString(File file) throws FileNotFoundException {
        // Create a scanner from the file
        Scanner input = new Scanner(file);

        // Convert the File to a String
        StringBuffer result = new StringBuffer();

        while (input.hasNextLine()) {
            result.append(input.nextLine() + "\n");
        }

        return result.toString();
    }

    // Take a string and prints every 60 characters to a line in the output
    // Does not break words apart
    public static void outputLine(String line, PrintStream output) {
        while (line.length() > MAX_LENGTH) {
            // Find the next break in the line
            int lineBreak = MAX_LENGTH;

            while (line.length() > lineBreak && !Character.isWhitespace(line.charAt(lineBreak))) {
                lineBreak++;
            }

            output.println(line.substring(0, lineBreak));
            line = line.substring(lineBreak);
        }
        output.println(line);
    }
}
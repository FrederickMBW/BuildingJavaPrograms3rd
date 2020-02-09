import java.util.*;
import java.io.*;

public class LeetSpeak {
    public static void main(String[] args) throws FileNotFoundException {
        if (args[0].equals(args[1])) {
            throw new IllegalArgumentException();
        }

        // Get the input file name from the command line argument and create a scanner
        // with it
        Scanner input = new Scanner(new File(args[0]));

        // Get the output file name from the command line argument and create a
        // PrintStream with it
        PrintStream output = new PrintStream(new File(args[1]));

        // Convert the input into leetspeak and print to the output file
        leetSpeak(input, output);
    }

    // Converts the input in the given scanner to leetspeak and print it to the
    // given printStream
    public static void leetSpeak(Scanner input, PrintStream output) {
        // Convert each line to leetspeak and print to printstream
        while (input.hasNextLine()) {
            output.println(leetSpeak(input.nextLine()));
        }
    }

    // Returns a given string as leetspeak
    public static String leetSpeak(String line) {
        // Create a scanner to go through every token
        Scanner input = new Scanner(line);

        // Convert each token to leetspeak and add to the result;
        String result = "";

        while (input.hasNext()) {
            result += "(" + tokenLeetSpeak(input.next()) + ") ";
        }

        return result;
    }

    // Returns a given string as leetspeak. Does not split it into tokens
    public static String tokenLeetSpeak(String token) {
        String result = "";

        // Goes through and converts every letter to leetspeak
        for (int i = 0; i < token.length(); i++) {
            char next = token.charAt(i);

            if (next == 'o') {
                result += '0';
            } else if (next == 'l') {
                result += '1';
            } else if (next == 'e') {
                result += '3';
            } else if (next == 'a') {
                result += '4';
            } else if (next == 't') {
                result += '7';
            } else if (next == 's') {
                result += 'z';
            } else {
                result += next;
            }
        }

        return result;
    }
}
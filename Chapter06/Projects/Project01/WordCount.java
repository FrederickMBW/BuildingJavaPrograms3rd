import java.util.*;
import java.io.*;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        // Get the file name from the command line and create a scanner from it
        Scanner input = new Scanner(new File(args[0]));

        // Count the number of lines, words, and characters
        int lines = 0;
        int words = 0;
        int characters = 0;

        while (input.hasNextLine()) {
            // Get the next lines
            lines++;
            String nextLine = input.nextLine();

            // Create a scanner from the line and count all the words and characters
            Scanner line = new Scanner(nextLine);

            while (line.hasNext()) {
                String nextWord = line.next();
                words++;
                characters += nextWord.length();
            }
        }

        // Print the results to the command line
        System.out.printf("Lines: %d\nWords: %d\nCharacters: %d\n", lines, words, characters);
    }
}

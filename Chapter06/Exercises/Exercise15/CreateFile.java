import java.util.*;
import java.io.*;

// Creates files to test Coin Flip
public class CreateFile {
    public static void main(String[] args) throws FileNotFoundException {
        // Get file name from command line and create the file
        File file = new File(args[0]);

        // Create the output printstream from the fil
        PrintStream output = new PrintStream(file);

        // Add the heads and tails to the files
        Random rand = new Random();

        int lines = rand.nextInt(10) + 1;

        for (int line = 0; line < lines; line++) {
            int length = rand.nextInt(25) + 1;

            for (int i = 0; i < length; i++) {
                output.print(getHeadsOrTails(rand) + " ");
            }

            if (line < lines - 1) {
                output.println();
            }
        }
    }

    public static String getHeadsOrTails(Random rand) {
        int headTail = rand.nextInt(4);

        if (headTail == 0) {
            return "H";
        } else if (headTail == 1) {
            return "T";
        } else if (headTail == 2) {
            return "h";
        } else {
            return "t";
        }
    }
}
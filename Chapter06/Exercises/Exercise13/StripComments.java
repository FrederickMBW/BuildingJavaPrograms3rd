import java.util.*;
import java.io.*;

public class StripComments {
    public static void main(String[] args) throws FileNotFoundException {
        // Get a file name from the command line and use it to create a scanner
        Scanner input = new Scanner(new File(args[0]));

        // Print the file with the comments removed
        stripComments(input);
    }

    // Strip the comments from a file and print to the console
    // I assume a // comment never comes for before a /* */ comment
    public static void stripComments(Scanner input) {
        while (input.hasNextLine()) {
            String line = input.nextLine();

            while (line.contains("/*")) {
                System.out.print(line.substring(0, line.indexOf("/*")));

                while (!line.contains("*/") && input.hasNextLine()) {
                    line = input.nextLine();
                }

                line = line.substring(line.indexOf("*/") + 2);
            }

            if (line.contains("//")) {
                System.out.println(line.substring(0, line.indexOf("//")));
            } else {
                System.out.println(line);
            }
        }
    }
}
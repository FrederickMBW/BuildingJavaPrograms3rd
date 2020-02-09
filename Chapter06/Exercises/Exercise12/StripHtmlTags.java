import java.util.*;
import java.io.*;

public class StripHtmlTags {
    public static void main(String[] args) throws FileNotFoundException {
        // Get the file name from the command line and create a file
        Scanner input = new Scanner(new File(args[0]));

        // Print the file with the HTML tags removed
        stripHtmlTags(input);
    }

    // Print the file with HTML tags removed
    public static void stripHtmlTags(Scanner input) {
        while (input.hasNextLine()) {
            stripHtmlTags(input.nextLine());
        }
    }

    // Print the line with the HTML tags removed
    // Assumes string is a single line
    public static void stripHtmlTags(String line) {
        while (line.contains("<") && line.contains(">")) {
            System.out.print(line.substring(0, line.indexOf("<")));

            if (line.indexOf(">") == line.length() - 1) {
                line = "";
            } else {
                line = line.substring(line.indexOf(">") + 1);
            }
        }

        System.out.println(line);
    }
}
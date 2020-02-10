import java.util.*;
import java.io.*;

public class Diff {
    public static void main(String[] args) throws FileNotFoundException {
        // Create a console for user input
        Scanner console = new Scanner(System.in);

        // Get the files
        File file1 = getFile(console);
        File file2 = getFile(console);

        // Find and print the differences
        printDiff(file1, file2);
    }

    // Prints the diff between two files
    // Only compares line by line
    public static void printDiff(File file1, File file2) throws FileNotFoundException {
        // Create a Scanner for each of the files
        Scanner scanner1 = new Scanner(file1);
        Scanner scanner2 = new Scanner(file2);

        // Print a generic starting message
        System.out.println("Differences found: ");

        // Print every line that is different between the two files
        int line = 0;
        while (scanner1.hasNextLine() && scanner2.hasNextLine()) {
            String line1 = scanner1.nextLine();
            String line2 = scanner2.nextLine();
            line++;

            if (!line1.equals(line2)) {
                System.out.printf("Line %d:\n", line);
                System.out.printf("< %s\n> %s\n\n", line1, line2);
            }
        }

        // Print any remaining lines from scanner1
        while (scanner1.hasNextLine()) {
            line++;
            System.out.printf("Line %d:\n", line);
            System.out.printf("< %s\n> %s\n\n", scanner1.nextLine(), "");
        }

        // Print any remaining lines from scanner2
        while (scanner2.hasNextLine()) {
            line++;
            System.out.printf("Line %d:\n", line);
            System.out.printf("< %s\n> %s\n\n", "", scanner2.nextLine());
        }
    }

    // Gets a file name from the user and creates a File
    // Returns the File
    public static File getFile(Scanner console) throws FileNotFoundException {
        // Get a name from the user
        System.out.print("File name: ");

        // Create a file from the file name given by the user
        File file = new File(console.next());

        // Keep prompting for a file name until getting a valid file
        while (!file.exists() || !file.canRead()) {
            System.out.print("Please enter a valid file name: ");
            file = new File(console.next());
        }

        return file;
    }
}
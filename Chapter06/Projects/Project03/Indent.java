import java.util.*;
import java.io.*;

public class Indent {
    public static final String INDENT = "\t";

    public static void main(String[] args) throws FileNotFoundException {
        // Create a console for user input
        Scanner console = new Scanner(System.in);

        // Get the file
        File file = getFile(console);

        // Print the file to the console properly indented
        indent(file);
    }

    // Assumes the given file is a java program and indents appropriately
    // Uses the assumptions from the text book
    public static void indent(File file) throws FileNotFoundException {
        // Create a scanner from the file
        Scanner input = new Scanner(file);

        // Indent each line of the file correctly
        int indent = 0;
        while (input.hasNextLine()) {
            String next = input.nextLine().trim();

            // Update indent for right-brace
            if (next.contains("}")) {
                indent--;
            }

            // Indent the line
            for (int i = 0; i < indent; i++) {
                System.out.print(INDENT);
            }

            // Print the text of the line
            System.out.println(next);

            // Update indent for left-brace
            if (next.contains("{")) {
                indent++;
            }
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
import java.util.*;
import java.io.*;

public class MadLabs {
    public static void main(String[] args) throws FileNotFoundException {
        // Create a console for user input
        Scanner console = new Scanner(System.in);

        // Get the file and create a scanner from it
        Scanner input = new Scanner(getFile(console));

        // Play MadLabs and return the completed String
        String madlab = getMadLab(input, console);

        // Print the completed madlab
        System.out.println(madlab);
    }

    // Plays madlabs with the given scanner and return the completed madlab
    public static String getMadLab(Scanner input, Scanner console) {
        StringBuffer result = new StringBuffer();

        // Go through every line in the input
        while (input.hasNextLine()) {
            Scanner line = new Scanner(input.nextLine());

            // Go through every token in the line
            // If a token is surrounded by < and >, ask for the type of word required
            // Otherwise, add the token to the result
            while (line.hasNext()) {
                String token = line.next();

                if (token.charAt(0) == '<' && token.charAt(token.length() - 1) == '>') {
                    result.append(getUserInput(token, console) + " ");
                } else {
                    result.append(token + " ");
                }
            }

            result.append("\n");
        }

        return result.toString();
    }

    // Get the user input for the given token
    public static String getUserInput(String token, Scanner console) {
        // Remove and replace any '-' in the token
        token = token.replace('-', ' ');

        // Get user input
        System.out.printf("Please enter a(n) %s: ", token);
        return console.next();
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
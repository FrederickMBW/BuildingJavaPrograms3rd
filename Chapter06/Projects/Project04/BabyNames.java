import java.util.*;
import java.io.*;

public class BabyNames {
    public static final String fileName = "names.txt";

    public static void main(String[] args) throws FileNotFoundException {
        // Create a console for user input
        Scanner console = new Scanner(System.in);

        // Get the file
        File file = new File(fileName);

        // Print welcome message
        printWelcomeMessage();

        // Get the name from the user
        System.out.print("Name? ");
        String name = console.next();

        // Print the stats for the name
        printStats(name, file);

    }

    // Prints the stats for a given name
    // Assumes valid input
    // I ignore the case when the name is not found
    public static void printStats(String name, File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);

        // Try to find the line with the given name in the file and print its data
        String data = "";
        while (input.hasNextLine()) {
            data = input.nextLine();
            String lineName = data.substring(0, data.indexOf(' '));

            if (lineName.equals(name)) {
                break;
            }
        }

        // Print the data for the name
        System.out.printf("Statistics on the name \"%s\"\n", name);

        // create a scanner for the data
        Scanner popularity = new Scanner(data);

        // Remove the name from the scanner and print the data for every year
        popularity.next();

        int year = 1900;
        while (popularity.hasNextInt()) {
            int yearPopularity = popularity.nextInt();
            System.out.printf("    %d: %d\n", year, yearPopularity);
            year += 10;
        }
    }

    // Print the welcome message for the program
    public static void printWelcomeMessage() {
        System.out.println("This program allows you to search through the");
        System.out.println("data from the Social Security Administration");
        System.out.println("to see how popular a particular name has been");
        System.out.println("since 1900\n\n");
    }
}
import java.util.*;
import java.util.Locale.LanguageRange;

public class Project01 {
    public static void main(String[] args) {
        // Create a console for user input
        Scanner console = new Scanner(System.in);

        // Print the welcome Message
        printWelcomeMessage();

        // Get the two integers from the user
        LargeInteger integer1 = new LargeInteger(getInt(console));
        LargeInteger integer2 = new LargeInteger(getInt(console));

        // Add the two integers together
        LargeInteger added = LargeInteger.add(integer1, integer2);

        // Print the final message
        System.out.println("Integer 1: " + integer1);
        System.out.println("Integer 2: " + integer2);
        System.out.println("In1 + In2: " + added);

    }

    // Prints the welcome message for the program
    public static void printWelcomeMessage() {
        System.out.println("\nThis programs adds two integers together");
        System.out.println("Integers can be up to 50 digits long\n");
    }

    // Gets an integers from the user
    public static String getInt(Scanner console) {
        System.out.print("Integer: ");

        String n = console.next();

        while (!isValidPositiveInt(n)) {
            System.out.println("Please enter a positive integer: ");
            n = console.next();
        }

        return n;
    }

    // Returns true if given a valid positive integer
    // Returns false otherwise
    public static boolean isValidPositiveInt(String n) {
        for (int i = 0; i < n.length(); i++) {
            if (!Character.isDigit(n.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
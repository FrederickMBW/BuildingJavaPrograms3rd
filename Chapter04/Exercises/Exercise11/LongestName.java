import java.util.*;

public class LongestName {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberOfNames = Integer.parseInt(args[0]);

        longestName(console, numberOfNames);
    }

    public static void longestName(Scanner console, int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }

        // Get the first name
        System.out.print("Name #1? ");
        String longestName = console.nextLine();

        // Get the rest of the names
        for (int i = 2; i <= n; i++) {
            System.out.print("Name #" + i + "? ");
            String next = console.nextLine();
            longestName = longestString(longestName, next);
        }

        // Convert the longest name to the proper format
        longestName = formatName(longestName);

        // Print the results
        System.out.print(longestName + "'s name is the longest");
    }

    // returns the longer string
    // if the names are the same length, returns the first string
    public static String longestString(String s1, String s2) {
        if (s1.length() >= s2.length()) {
            return s1;
        } else {
            return s2;
        }
    }

    public static String formatName(String name) {
        // Create a new string buffer for the conversion
        StringBuffer result = new StringBuffer();

        // Add the first letter to the string buffer in upper case
        if (name.length() > 0) {
            result.append(Character.toUpperCase(name.charAt(0)));
        } 
        
        // Add the rest of the letters to the string buffer in lower case
        for (int i = 1; i < name.length(); i++) {
            char next = Character.toLowerCase(name.charAt(i));
            result.append(next);
        }

        // Return the name as a String
        return result.toString();
    }
}
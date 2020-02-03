import java.util.*;

public class RandomLines {
    public static void main(String[] args) {
        randomLines();
    }

    public static void randomLines() {
        // Create a random number generator
        Random rand = new Random();

        // Decide on the number of lines to print
        int lines = rand.nextInt(6) + 5;

        // Print all the lines
        for (int i = 0; i < lines; i++) {
            System.out.println(getLine(rand));
        }
    }

    public static String getLine(Random rand) {
        // Get String length
        int length = rand.nextInt(80);

        // Create the String
        String result = "";
        for (int i = 0; i < length; i++) {
            int next = rand.nextInt(24) + 'a';
            result += (char) next;
        }

        return result;
    }
}
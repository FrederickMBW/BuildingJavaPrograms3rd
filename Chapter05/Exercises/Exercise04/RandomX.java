import java.util.*;

public class RandomX {
    public static void main(String[] args) {
        randomX();
    }

    public static void randomX() {
        // Create a random number generator
        Random rand = new Random();

        // Get the first random number
        int next = rand.nextInt(16) + 5;

        // Get random numbers until getting a random number greater than 16
        // and print that many characters
        while (next < 16) {
            printChar('x', next);
            next = rand.nextInt(15) + 5;
        }

        // Use the last random number to print that many x's
        printChar('x', next);

    }

    // Prints a char n times
    public static void printChar(char c, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}
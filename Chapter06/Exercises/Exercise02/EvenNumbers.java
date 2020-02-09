import java.util.*;

public class EvenNumbers {
    public static void main(String[] args) {
        // Get the numbers from the command line and create a Scanner object from them
        Scanner input = new Scanner(args[0]);

        // Run the method from the exercise
        evenNumbers(input);
    }

    // I dislike my variable names.
    public static void evenNumbers(Scanner input) {
        // Create integers to keep track of values to calculate stats
        int count = 0;
        int total = 0;
        int evenNumbers = 0;

        while (input.hasNextInt()) {
            // Get the next value from the scanner
            int next = input.nextInt();

            // Keep track of the stats
            count++;
            total += next;

            if (next % 2 == 0) {
                evenNumbers++;
            }
        }

        // Calculate the percent of evens
        double evens = 100.0 * evenNumbers / count;

        // Report the stats
        System.out.printf("%d numbers, sum = %d\n", count, total);
        System.out.printf("%d evens (%.2f%%)\n", evenNumbers, evens);
    }
}
import java.util.*;

public class EvenSumMax {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        evenSumMax(console);
    }

    public static void evenSumMax(Scanner console) {
        // Get the number of integers to enter
        System.out.print("Number of integers? ");
        int numberOfIntegers = console.nextInt();

        // Get the first integer to have a starting point for max
        System.out.print("Next integer? ");
        int max = console.nextInt();
        int sum = max;

        // Get the rest of the integers
        // Keep track of the sum and and max
        for (int i = 1; i < numberOfIntegers; i++) {
            System.out.print("Next integer? ");
            int next = console.nextInt();

            if (next % 2 == 0) {
                max = Math.max(max, next);
                sum += next;
            }
        }

        // Print the sum and max
        System.out.print("Even sum = " + sum + ", Even max = " + max);
    }
}
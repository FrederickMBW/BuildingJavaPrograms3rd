import java.util.*;

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        smallestLargest(console);
    }

    public static void smallestLargest(Scanner console) {
        // Get the number of numbers to enter
        System.out.print("How many numbers do you want to enter? ");
        int numberOfNumbers = console.nextInt();

        // Get the first number and set max and min to that number
        int max, min;
        System.out.print("Number 1: ");
        max = min = console.nextInt();

        // Get the rest of the numbers and update max and min if required
        for (int i = 2; i <= numberOfNumbers; i++) {
            System.out.print("Number " + i + ": ");
            int next = console.nextInt();

            min = Math.min(min, next);
            max = Math.max(max, next);
        }

        // Print the smallest and largest numbers
        System.out.println("Smallest = " + min);
        System.out.println("Largest = " + max);
    }
}
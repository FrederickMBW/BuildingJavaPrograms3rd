import java.util.*;

public class PrintAverage {
    public static void main(String[] args) {
        printAverage();
    }

    public static void printAverage() {
        // Create scanner to get user input
        Scanner console = new Scanner(System.in);

        // Get the first number from the user
        int next = getInt(console, "Type a number: ");

        // Count the number of numbers entered and keep track of the sum
        int count = 0;
        int sum = 0;

        // Keep getting numbers from the user until they enter a negative number
        while(next >= 0) {
            count++;
            sum += next;

            next = getInt(console, "Type a number: ");
        }

        // Print the average
        if (count >= 1) {
            System.out.println((double) sum / count);
        }
        
    }

    // Get an integer from the user
    public static int getInt(Scanner console, String message) {
        System.out.print(message);

        while (!console.hasNextInt()) {
            console.next();
            System.out.print("Please enter a valid integer: ");
        }

        return console.nextInt();
    }    
}
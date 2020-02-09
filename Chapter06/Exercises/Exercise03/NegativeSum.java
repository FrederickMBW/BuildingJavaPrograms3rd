import java.util.*;

public class NegativeSum {
    public static void main(String[] args) {
        // Create a scanner from the integers given from the command line
        // The integers must be enclosed in quotation marks
        Scanner input = new Scanner(args[0]);

        // Run the method
        System.out.println(negativeSum(input));
    }

    public static boolean negativeSum(Scanner input) {
        int sum = 0;
        int steps = 0;

        while (input.hasNextInt()) {
            steps++;
            sum += input.nextInt();

            if (sum < 0) {
                System.out.printf("sum of %d after %d steps\n", sum, steps);
                return true;
            }
        }

        System.out.println("no negative sum");
        return false;
    }
}
// I should make this work with pennies, nickels, dimes, and quarters
// instead of just penny, nickel, dime, and quarter. 
// But, I don't feel like it.

import java.util.*;

public class CointCoins {
    private static final double PENNY_VALUE = 0.01;
    private static final double NICKEL_VALUE = 0.05;
    private static final double DIME_VALUE = 0.1;
    private static final double QUARTER_VALUE = 0.25;

    public static void main(String[] args) {
        Scanner input = new Scanner(args[0]);

        cointCoins(input);
    }

    public static void cointCoins(Scanner input) {
        double total = 0;

        while (input.hasNextInt()) {
            // Get the number of coins
            int numberOfCoins = input.nextInt();

            // Exit if not a valid integer
            if (numberOfCoins < 0) {
                System.out.println("Invalid Input");
                return;
            }

            // Get the type of coin
            String type;
            if (input.hasNext()) {
                type = input.next().toLowerCase();
            } else {
                System.out.println("Invalid Input");
                return;
            }

            // Check that it is a valid type
            if (!isValidCoinType(type)) {
                System.out.println("Invalid Input");
                return;
            }

            // Add to the total
            if (type.equals("penny")) {
                total += numberOfCoins * PENNY_VALUE;
            } else if (type.equals("nickel")) {
                total += numberOfCoins * NICKEL_VALUE;
            } else if (type.equals("dime")) {
                total += numberOfCoins * DIME_VALUE;
            } else { // Quarter
                total += numberOfCoins * QUARTER_VALUE;
            }
        }

        System.out.printf("Total money: $%.2f\n", total);
    }

    // Returns if a coin is a valid type
    // Returns false otherwise
    // Valid types are Penny, Nickel, Dime, or Quarter
    public static boolean isValidCoinType(String type) {
        type = type.toLowerCase();

        return (type.equals("penny") || type.equals("nickel") || type.equals("dime") || type.equals("quarter"));
    }
}
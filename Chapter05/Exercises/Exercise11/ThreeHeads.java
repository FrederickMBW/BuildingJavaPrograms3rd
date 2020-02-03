import java.util.*;

public class ThreeHeads {
    public static final int MAGIC_NUMBER = 3;
    public static void main(String[] args) {
        threeHeads();
    }

    public static void threeHeads() {
        // Create a random number generator
        Random rand = new Random();

        // Count the number of Heads flipped
        int count = 0;

        // Keep flipping the coin until three heads are flipped
        while (count < MAGIC_NUMBER) {
            int flip = rand.nextInt(2);

            if (flip == 0) { // Heads
                count++;
                System.out.print("H ");
            } else { // Tails
                System.out.print("T ");
                count = 0;
            }
        }

        // Print finishing message
        System.out.println("\n" + MAGIC_NUMBER + " heads in a row!");
    }
}
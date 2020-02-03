import java.util.*;

public class RandomWalk {
    public static final int MIN = -3;
    public static final int MAX = 3;

    public static void main(String[] args) {
        randomWalk();
    }

    public static void randomWalk() {
        // Create a random number generator
        Random rand = new Random();

        // Set the position to 0
        int position = 0;

        // Print the starting position
        System.out.println("Position = " + position);

        // Move the position until at the min or max position
        while (position > MIN && position < MAX) {
            int nextMove = rand.nextInt(2);

            if (nextMove == 1) {
                position++;
            } else {
                position--;
            }

            System.out.println("Position = " + position);
        }
    }
}
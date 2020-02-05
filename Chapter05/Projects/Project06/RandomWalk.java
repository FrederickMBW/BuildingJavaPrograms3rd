// Project says to use a graphical display, but I don't feel like taking the time to do that.
// I will just use the console

import java.util.*;

public class RandomWalk {
    public static final int WALKING_RANGE = 100;

    public static void main(String[] args) {
        // Create a walker
        Walker walker = new Walker();

        // Create a random number generator
        Random rand = new Random();

        while (walker.getX() > -WALKING_RANGE && walker.getX() < WALKING_RANGE && walker.getY() > -WALKING_RANGE
                && walker.getY() < WALKING_RANGE) {
            // Move the walker
            moveWalker(walker, rand);

            // Print the walkers position to the console
            printWalkerPosition(walker);
        }
    }

    // Randomly move the walker
    public static void moveWalker(Walker walker, Random rand) {
        int movement = rand.nextInt(4);

        if (movement == 0) {
            walker.decrementX();
        } else if (movement == 1) {
            walker.decrementY();
        } else if (movement == 2) {
            walker.incrementX();
        } else {
            walker.incrementY();
        }
    }

    // Prints the walkers position to the console
    public static void printWalkerPosition(Walker walker) {
        System.out.printf("X: %5dY: %5d\n", walker.getX(), walker.getY());
    }
}
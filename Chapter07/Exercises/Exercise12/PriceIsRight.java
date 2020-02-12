// Tested on Practice it
// https://practiceit.cs.washington.edu/\

public class PriceIsRight {

    // Finds the highest bid without going over
    public static int priceIsRight(int[] guesses, int actual) {
        // Keep track of the closest bid
        int closest = -1; // -1 represents every bid has gone over so far

        // Find the closest bid without going over
        for (int i = 0; i < guesses.length; i++) {
            int difference = actual - guesses[i];

            if (closest == -1 && difference >= 0) {
                closest = difference;
            } else if (difference >= 0 && difference < closest) {
                closest = difference;
            }
        }

        return closest == -1 ? -1 : actual - closest;
    }
}
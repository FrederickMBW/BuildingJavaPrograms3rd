// Tested on Practice it
// https://practiceit.cs.washington.edu/\

public class PercentEven {

    // Returns the percent of numbers in an array that are even
    public static double percentEven(int[] a) {
        // Return zero if null or empty array
        if (a == null || a.length < 1) {
            return 0;
        }

        // Count the number of even numbers in the array
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
        }

        // Calculate the percentage of even numbers and return the result
        return 100.0 * count / a.length;
    }
}
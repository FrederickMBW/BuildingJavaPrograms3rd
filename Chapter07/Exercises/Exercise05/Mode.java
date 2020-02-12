// Tested on Practice it
// https://practiceit.cs.washington.edu/

// Returns the most frequently occurring element in the array
// Assumes the arr has atleast 1 element
// Integers are between 0 and 100 inclusive
public class Mode {
    public static int mode(int[] arr) {
        if (arr.length < 1) {
            throw new IllegalArgumentException();
        }

        // Create an array to keep track of the number of times an integer appears
        int[] count = new int[101];

        // Count the number of times each integer appears in the given array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Find the integer that appears the most often
        // If a tie, return the smallest number
        int mode = 0;
        int max = count[0];

        for (int i = 1; i < count.length; i++) {
            if (count[i] > max) {
                mode = i;
                max = count[i];
            }
        }

        // Return the mode
        return mode;
    }
}
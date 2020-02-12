// Tested on Practice it
// https://practiceit.cs.washington.edu/

public class Range {
    // Finds the range of integers in an array
    // Assumes the array has atleast one element
    public static int range(int[] array) {
        if (array.length < 1) {
            throw new IllegalArgumentException();
        }

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

            if (array[i] > max) {
                max = array[i];
            }
        }

        return max - min + 1;
    }
}
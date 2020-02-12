// Tested on Practice it
// https://practiceit.cs.washington.edu/

public class CountInRange {
    // Returns the number of integers between min and max in the array
    public static int countInRange(int[] arr, int min, int max) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= min && arr[i] <= max) {
                count++;
            }
        }

        return count;
    }
}
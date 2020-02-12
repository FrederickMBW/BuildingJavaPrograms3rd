// Tested on Practice it
// https://practiceit.cs.washington.edu/

public class MinGap {

    // Returns the min gap between two adjacent elements in the array
    public static int minGap(int[] a) {
        if (a == null || a.length < 2) {
            return 0;
        }

        // Find the min gap
        int min = a[1] - a[0];

        for (int i = 1; i < a.length - 1; i++) {
            int gap = a[i + 1] - a[i];

            if (gap < min) {
                min = gap;
            }
        }

        return min;
    }
}
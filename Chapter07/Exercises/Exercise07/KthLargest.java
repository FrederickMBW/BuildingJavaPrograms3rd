// Tested on Practice it
// https://practiceit.cs.washington.edu/

import java.util.*;

public class KthLargest {
    public static int kthLargest(int k, int[] a) {
        if (k > a.length) {
            throw new IllegalArgumentException();
        }

        // Sort the array
        Arrays.sort(a);

        // Return the kth largest elememt
        return a[a.length - k - 1];
    }
}
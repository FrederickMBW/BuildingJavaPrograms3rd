// Tested on Practice it
// https://practiceit.cs.washington.edu/

import java.util.*;

public class Median {
    
    // returns the median for an array
    // Assume an odd number length for the array
    public static int median(int[] a) {
        // Sort the array
        Arrays.sort(a);

        // Find and return the median
        return a[a.length / 2];
    }
}
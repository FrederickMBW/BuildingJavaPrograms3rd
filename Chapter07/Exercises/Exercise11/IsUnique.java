// Tested on Practice it
// https://practiceit.cs.washington.edu/\

import java.util.*;

public class IsUnique {
    // Checks if every value in an array is unique
    // Returns true if every value is unique
    // Returns false otherwise
    public static boolean isUnique(int[] a) {
        // Sort the array
        Arrays.sort(a);

        // Return false if any elements repeat
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
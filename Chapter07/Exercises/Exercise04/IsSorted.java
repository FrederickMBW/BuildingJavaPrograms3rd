// Tested on Practice it
// https://practiceit.cs.washington.edu/


// Returns true if the given array is sorted
// returns false otherwise
public class IsSorted {
    public static boolean isSorted(double[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
}
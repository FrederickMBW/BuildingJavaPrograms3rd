// Tested on Practice it
// https://practiceit.cs.washington.edu/

public class LastIndexOf {
    // Returns the last index of an integer in an array
    // Returns -1 if the integer is not in the array
    public static int lastIndexOf(int[] array, int n) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == n) {
                return i;
            }
        }

        return -1;
    }
}
import java.util.Arrays;

// Tested on Practice it
// https://practiceit.cs.washington.edu/\

public class Contains {
    // Checks if list1 contains list2
    // Returns if if list1 contains list2
    // Returns false otherwise
    public static boolean contains(int[] list1, int[] list2) {
        for (int i = 0; i < list1.length - list2.length + 1; i++) {   
            if (Arrays.equals(Arrays.copyOfRange(list1, i, i + list2.length), list2)) {
                return true;
            }
        }

        return false;
    }
}
// Tested on Practice it
// https://practiceit.cs.washington.edu/\

public class Contains {

    // Checks if all the values in list2 to appear in list1 in the same order
    public static boolean contains(int[] list1, int[] list2) {
        // Go through every element in list two
        // Check that every element in list2 appears in list1 in the same order
        int list1Position = 0;
        for (int i = 0; i < list2.length; i++) {   
            list1Position = indexAfter(list1, list2[i], list1Position) + 1;

            if (list1Position == 0) {
                return false;
            }
        }

        return true;
    }

    // Returns the first index that n appears in an array at or after the given index
    // Returns -1 if not found
    public static int indexAfter(int[] list, int n, int index) {
        for (int i = index; i < list.length; i++) {
            if (list[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
import java.util.Arrays;

// Tested on Practice it
// https://practiceit.cs.washington.edu/\

public class Contains {
    public static void main(String[] args) {
        int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
        int[] list2 = {1, 2, 1};
        contains(list1, list2);
    }

    // Checks if list1 contains list2
    // Returns if if list1 contains list2
    // Returns false otherwise
    public static boolean contains(int[] list1, int[] list2) {
        for (int i = 0; i < list1.length - list2.length + 1; i++) {   
            if (equals(Arrays.copyOfRange(list1, i, i + list2.length).equals(list2), list2) {
                return true;
            }
        }

        return false;
    }

    // Returns true if two arrays are the same
    public static boolean equals(int[] a1, int[] a2) {
        if (a1.length != a2.length) {
            return false;
        }

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }

        return true;
    }
}
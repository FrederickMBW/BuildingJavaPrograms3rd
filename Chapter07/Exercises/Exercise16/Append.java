// Tested on Practice it
// https://practiceit.cs.washington.edu/\

public class Append {

    // Appends the the second array to the end of the first array
    public static int[] append(int[] a1, int[] a2) {
        // Throw an error if either array is null
        if (a1 == null | a2 == null) {
            throw new NullPointerException();
        }

        // Determine the length of the resulting array
        int length = a1.length + a2.length;

        // Create the resulting array
        int[] result = new int[length];

        // Add the first array to the resulting array
        for (int i = 0; i < a1.length; i++) {
            result[i] = a1[i];
        }

        // Add the second array to the resulting array
        for (int i = 0; i < a2.length; i++) {
            result[i + a1.length ] = a2[i];
        }

        // Return the appended array
        return result;
    }
}
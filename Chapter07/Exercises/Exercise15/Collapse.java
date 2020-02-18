public class Collapse {
    public static int[] collapse(int[] a) {
    // Determine the length of the resulting array
    int length = a.length / 2;
    if (a.length % 2 != 0) {
        length++;
    }

    // Create the resulting array
    int[] result = new int[length];

    // Collapse the given array into the resulting array
    for (int i = 1; i < a.length; i++) {
        result[i/2] = a[i] + a[i-1];
    }

    // If given an odd array, add the last element to the result
    if (a.length % 2 != 0) {
        result[result.length-1] = a[a.length-1];
    }

    return result;
    }

}
// Tested on Practice it
// https://practiceit.cs.washington.edu/\

public class LongestSortedSequence {

    // Return the longest sequence of sorted integers in an array
    public static int longestSortedSequence(int[] a) {
        // Return zero if passed an empty array or null
        if (a == null || a.length < 1) {
            return 0;
        }

        // Find the longest sequence
        int longestSequenceLength = 1;
        int currentSequenceLength = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] >= a[i-1]) {
                currentSequenceLength++;
            } else {
                if (currentSequenceLength > longestSequenceLength) {
                    longestSequenceLength = currentSequenceLength;
                }
                currentSequenceLength = 1;
            }
            
            if (i == a.length - 1 && currentSequenceLength > longestSequenceLength) {
                longestSequenceLength = currentSequenceLength;
            }
        }

        return longestSequenceLength;
    }
}
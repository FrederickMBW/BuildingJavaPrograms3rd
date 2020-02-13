// Tested on Practice it
// https://practiceit.cs.washington.edu/\

public class VowelCount {
    // Returns an array representing the number of times each vowel appears in a string
    public static int[] vowelCount(String s) {
        // Create the array to hold the counts
        int[] vowels = new int[5];

        // Count the number of vowels
        for (int i = 0; i < s.length(); i++) {
            char next = Character.toUpperCase(s.charAt(i));

            if (next == 'A') { 
                vowels[0]++;
            } else if (next == 'E') {
                vowels[1]++;
            } else if (next == 'I') {
                vowels[2]++;
            } else if (next == 'O') {
                vowels[3]++;
            } else if (next == 'U') {
                vowels[4]++;
            }
        }

        // Return the number of vowels
        return vowels;
    }
}
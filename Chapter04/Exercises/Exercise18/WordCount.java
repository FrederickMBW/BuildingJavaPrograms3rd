public class WordCount {
    public static void main(String[] args) {
        String s = args[0];

        System.out.print(wordCount(s));
    }

    // Count the number of words in a string without using a while loop
    public static int wordCount(String s) {
        // Create a counter to keep track of the number of words
        int wordCount = 0;

        // Create a boolean to keep track of spaces
        boolean lastLetterWasSpace = true;

        // Remove the spaces from the beginning and end of the String
        s = s.trim();

        // Count the number of words in the String
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && lastLetterWasSpace == true) {
                lastLetterWasSpace = false;
                wordCount++;
            } else if (s.charAt(i) == ' ' && lastLetterWasSpace == false) {
                lastLetterWasSpace = true;
            }
        }

        // Return the number of words in the String
        return wordCount;
    }
}
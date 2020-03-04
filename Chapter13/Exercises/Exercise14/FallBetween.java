import java.util.*;
import java.io.*;

public class FallBetween {
    public static void main(String[] args) throws FileNotFoundException {
        // Get the file
        File dictionary = new File("dictionary.txt");

        // Get a list created from the file
        List<String> words = getWords(dictionary);

        // Print a message
        printWelcomeMessage();

        // Get the two words from the user
        Scanner console = new Scanner(System.in);
        System.out.print("Word 1: ");
        String word1 = console.next().toLowerCase();
        System.out.print("Word 2: ");
        String word2 = console.next().toLowerCase();

        // Get the number of words inbetween
        int wordsBetween = getWordsBetween(words, word1, word2);

        // Print the result
        if (wordsBetween < 0) {
            System.out.println("One of the words was not found");
        } else {
            System.out.printf("There are %d words between %s and %s", wordsBetween, word1, word2);
        }
    }

    // Returns the number of words between the two given words
    public static int getWordsBetween(List<String> words, String word1, String word2) {
        if (!words.contains(word1) || !words.contains(word2)) {
            return -1;
        }

        int word1Index = Collections.binarySearch(words, word1);
        int word2Index = Collections.binarySearch(words, word2);

        if (word1Index - word2Index == 0) {
            return 0;
        } else if (word1Index < word2Index) {
            return word2Index - word1Index - 1;
        } else {
            return word1Index - word2Index - 1;
        }
    }

    // Returns a list of all words in the given file
    // The list is in the order the words appear in the file
    public static List<String> getWords(File file) throws FileNotFoundException {
        // Create a scanner to go through all the words in the file
        Scanner input = new Scanner(file);

        // Create a list to store all the words in the file
        List<String> words = new ArrayList<String>();

        // Add all the words in the file to the list
        while (input.hasNext()) {
            words.add(input.next());
        }

        // Return the words
        return words;
    }

    // Prints a welcome message for the program
    public static void printWelcomeMessage() {
        System.out.println("Enter two words and I will tell you the number of words between them!");
    }
}
import java.util.*;

public class PigLatin {
    public static void main(String[] args) {
        // Create a console for the user
        Scanner console = new Scanner(System.in);

        // Get a sentence from the user
        System.out.print("Sentence: ");
        String s = console.nextLine();

        // Convert the sentence to pig latin
        String pigString = toPigLatin(s);

        // Print the pig latin
        System.out.println(pigString);
    }

    // Returns a pig latin version of a given string
    public static String toPigLatin(String s) {
        // Create a variable to hold the pig latin version
        String pigLatin = "";

        // Create a scanner to go through the string
        Scanner string = new Scanner(s);

        // Create the pig latin words and add them to the string
        while (string.hasNext()) {
            String next = string.next();

            int consonants = consonantsAtStart(next);

            pigLatin += next.substring(consonants, next.length()) + "-" + next.substring(0, consonants) + "ay ";
        }

        return pigLatin;
    }

    // Return the number of consonants at the beginning of a string
    // Really, it returns the number of non-vowels at the start of String
    public static int consonantsAtStart(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toUpperCase(s.charAt(i));
            if (c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}
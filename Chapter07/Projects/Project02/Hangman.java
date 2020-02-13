import java.util.*;

public class Hangman {
    public static final int ALPHABIT_LENGTH = 26;
    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner console = new Scanner(System.in);

        // Get the word from the command line argument
        String word = args[0].toUpperCase();

        // Check if a valid word
        // Exit the program if not
        if (!isValidWord(word)) {
            System.out.println("Not a valid word");
            System.out.println("Words can only contain letters");
            System.out.println("Exiting the program");
            return;
        }

        // Playhangman!
        playHangman(word, console);

        // Print farewell message
        printFarewellMessage(word);
    }

    // Print the farewell message for the game
    public static void printFarewellMessage(String word) {
        System.out.printf("You guessed %s. Good job!", word);
    }

    // Play hangman!
    public static void playHangman(String word, Scanner console) {
        // Create an array to hold the guessed letters
         int[] guesses = new int[ALPHABIT_LENGTH];

        // Keep getting guesses from the user until they have correctly
        // guessed every letter
        while (true) {
            // Show the word with guessed letters showing and show the guessed letters
            System.out.println("Word: " + getWordWithGuesses(word, guesses));
            System.out.println("Guesses: " + getAlreadyGuessed(guesses));

            char guess = getLetter(console);

            if (alreadyGuessed(guess, guesses)) {
                System.out.println("Already Guessed");
                continue;
            }

            // Add the guess to the array
            guesses[guess - 'A']++;

            // Exit the loop if guessed all the letters correctly
            if (finishedHangman(word, guesses)) {
                break;
            }
        }
    }

    // Returns true if all the letters have been correctly guessed
    public static boolean finishedHangman(String word, int[] guesses) {
        for (int i = 0; i < word.length(); i++) {
            if (guesses[word.charAt(i) - 'A'] == 0) {
                return false;
            }
        }
        return true;
    }

    // Returns a string of the already guessed letters
    public static String getAlreadyGuessed(int[] guesses) {
        String result = "";

        for (int i = 0; i < guesses.length; i++) {
            if (guesses[i] > 0) {
                result += (char)(i + 'A');
            }
        }

        return result;
    }

    // Returns a string showing the word with correctly guessed letters showing
    // Letters that haven't been guessed don't show
    public static String getWordWithGuesses(String word, int[] guesses) {
        String result = "";

        // Display letters that have been guessed
        // Put blanks for letters that have not been guessed
        for (int i = 0; i < word.length(); i++) {
            if (guesses[word.charAt(i) - 'A'] > 0) {
                result += word.charAt(i);
            } else {
                result += "_";
            }
        }

        return result;
    }

    // Returns true if a letter has already been guessed
    // Returns false otherwise
    public static boolean alreadyGuessed(char guess, int[] guesses) {
        if (guesses[guess - 'A'] == 1) {
            return true;
        }
        return false;
    }

    // Gets a letter from the user
    public static char getLetter(Scanner console) {
        System.out.print("Next Guess: ");
        String result = console.next();

        while (!isValidCharacter(result)) {
            System.out.print("Please enter a valid character (a-z)(A-Z): ");
            result = console.next();
        }

        return Character.toUpperCase(result.charAt(0));
    }

    // Checks if a character is valid for the game
    public static boolean isValidCharacter(String ch) {
        if (ch == null || ch.length() != 1) {
            return false;
        }

        char c = Character.toUpperCase(ch.charAt(0));

        if (c < 'A' || c > 'Z') {
            return false;
        }

        return true;
    }

    // Returns true if the word is valid for hangman
    // Returns false otherwise
    public static boolean isValidWord(String word) {
        if (word == null || word.length() < 1) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            char next = Character.toUpperCase(word.charAt(i));
            if (next < 'A' || next > 'Z') {
                return false;
            }
        }
        return true;
    }
}
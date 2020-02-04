import java.util.*;

public class Hangman {
    public static void main(String[] args) {
        // Create a scanner to get input from the user
        Scanner console = new Scanner(System.in);

        // Get the length of the word from the user
        int length = getInt(console, "How long is the word? ");

        while(length < 1) {
            length = getInt(console, "Please enter a valid length? ");
        }

        // Try to guess all the letters
        String word = guessWord(console, length);

        // Print the word
        System.out.println("Your word was " + word);
    }

    // Get all the letters in the word from the user
    public static String guessWord(Scanner console, int length) {
        String word = "";

        for (int i = 1; i <= length; i++) {
            word += guessChar(console, i);
        }

        return word;
    }

    // Attempts to guess the charactor a user is thinking of
    // Returns the character after guessing it correctly
    public static char guessChar(Scanner console, int position) {
        // Create a random number generator
        Random rand = new Random();

        // Use this boolean to know when to exit the loop
        boolean isCorrectGuess = false;

        // Use this to keep track of the correct letter to return
        char letter;

        // Get the correct letter from the user
        do {
            letter = (char) (rand.nextInt(26) + 'A');

            System.out.print("Is letter " + position + " a(n) " + letter + "? ");

            isCorrectGuess = getYesOrNo(console);
        } while (!isCorrectGuess);

        return letter;
    }

    // Gets a yes or no answer from the user
    // Returns true for Y
    // Returns false for N
    public static boolean getYesOrNo(Scanner console) {
        String answer = console.next().toUpperCase();

        while (!answer.equals("Y") && !answer.equals("N")) {
            System.out.print("Please enter Y or N: ");
            answer = console.next().toUpperCase();
        }

        if (answer.equals("Y")) {
            return true;
        } else {
            return false;
        }
    }


    // Get an integer from the user
    public static int getInt(Scanner console, String message) {
        System.out.print(message);

        while (!console.hasNextInt()) {
            console.next();
            System.out.print("Please enter a valid integer: ");
        }

        return console.nextInt();
    }       
}
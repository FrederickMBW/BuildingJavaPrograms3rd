import java.util.*;

public class WordWrap {
    public static final int MAX_LENGTH = 60;

    public static void main(String[] args) {
        // Get the length of a test string from the command line
        int length = Integer.parseInt(args[0]);

        String word = "";

        for (int i = 0; i < length / 10; i++) {
            for (int j = 0; j < 10; j++) {
                word += i % 10;
            }
        }

        for (int i = 0; i < length % 10; i++) {
            word += i;
        }

        Scanner scanner1 = new Scanner(word);

        // Test the method on a single line
        wordWrap(scanner1);
    }

    public static void wordWrap(Scanner input) {
        while (input.hasNextLine()) {
            String next = input.nextLine();
            printLine(next);
        }
    }

    public static void printLine(String line) {
        while (line.length() > MAX_LENGTH) {
            System.out.println(line.substring(0, MAX_LENGTH));
            line = line.substring(MAX_LENGTH);
        }
        System.out.println(line);
    }
}
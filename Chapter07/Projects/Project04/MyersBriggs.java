import java.util.*;
import java.io.*;

public class MyersBriggs {
    public static final int NUMBER_OF_QUESTIONS = 70;
    public static final int GROUP_LENGTH = 7;
    public static void main(String[] args) throws FileNotFoundException {
        // Get the file name from the command line and create a scanner from it
        Scanner input = new Scanner(new File(args[0]));

        // Go through every line of the input and calculate their Myers-Briggs scores
        while (input.hasNextLine()) {
            String name = input.nextLine();
            String answers = input.nextLine();

            if (!isValidAnswers(answers)) {
                System.out.printf("Skipping %s, answers are not in the correct format\n", name);
                continue;
            }

            // Calculate scores for the person
            int[][] scores = calculateScores(name, answers);

            // Print the score for the person
            printScore(name, scores);
        }

    }

    // Prints the score for the given person
    public static void printScore(String name, int[][] score) {
        System.out.println(name);
        System.out.print("\t");

        // Print the number of A and B answers
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                if (j == 0) {
                    System.out.print(score[i][j] + "A-");
                } else {
                    System.out.print(score[i][j] + "B ");
                }
            }
        }

        // Print the percentage of A and B answers
        System.out.print("\n\t[");

        double percentB = 100.0 * score[0][1] / (score[0][0] + score[0][1]);
        System.out.printf("%.0f%%", percentB);

        for (int i = 1; i < score.length; i++) {
            percentB = 100.0 * score[i][1] / (score[i][0] + score[i][1]);
            System.out.printf(", %.0f%%", percentB);
        }
        System.out.print("] = ");
    
        // Print the types
        // Introverted or Extroverted
        if (score[0][0] > score [0][1]) {
            System.out.print("E");
        } else {
            System.out.print("I");
        }

        // Sense or Intuition
        if (score[0][0] > score [0][1]) {
            System.out.print("I");
        } else {
            System.out.print("S");
        }

        // Thinking or Feeling
        if (score[0][0] > score [0][1]) {
            System.out.print("F");
        } else {
            System.out.print("T");
        }

        // Judge or Perception
        if (score[0][0] > score [0][1]) {
            System.out.print("J\n");
        } else {
            System.out.print("P\n");
        }

    }

    // Calculates and print Myers-Briggs scores
    private static int[][] calculateScores(String name, String answers) {
        if (!isValidAnswers(answers)) {
            throw new IllegalArgumentException();
        }

        // Create an array to store the answers
        int[][] score = new int[4][2];

        // Go through every question and add the answer to the correct personallity group
        for (int i = 0; i < NUMBER_OF_QUESTIONS / GROUP_LENGTH; i++) {
            for (int j = 0; j < GROUP_LENGTH; j++) {
                char ch = answers.charAt(i * GROUP_LENGTH + j);

                if (j % 10 == 0) { // Introverted or Extroverted questions
                    if (ch == 'A') {
                        score[0][0]++;
                    } else {
                        score[0][1]++;
                    }
                } else if (j % 10 == 1 || j % 10 == 2) { // Sense or Intuition questions
                    if (ch == 'A') {
                        score[1][0]++;
                    } else {
                        score[1][1]++;
                    }
                } else if (j % 10 == 3 || j % 10 == 4) { // Thinking or Feeling questions
                    if (ch == 'A') {
                        score[2][0]++;
                    } else {
                        score[2][1]++;
                    }
                } else { // Judge or Perception Questions
                    if (ch == 'A') {
                        score[3][0]++;
                    } else {
                        score[3][1]++;
                    }
                }
            }
        }

        return score;
    }

    // Returns true if the given string is a valid answer for MyersBriggs
    private static boolean isValidAnswers(String s) {
        // Return false if string is Null
        if (s == null) {
            return false;
        }

        // Return false if length is wrong
        if (s.length() != NUMBER_OF_QUESTIONS) {
            return false;
        }

        // Check that every letter is A or B
        // Return false if any letter is not
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != 'A' && ch != 'B') {
                return false;
            }
        }

        // Passed all the tests. It is a valid answer
        return true;
    }
}
import java.util.*;

public class Pig {
    public static final int MAX_SCORE = 100;
    public static void main(String[] args) {
        // Creates a die for the game
        Die die = new Die();

        // Create a console for the game
        Scanner console = new Scanner(System.in);

        // Print welcome message
        System.out.println("Starting a two player game of Pig.");

        // Keep track of the players total scores and rolling scores
        int p1TotalScore = 0;
        int p2TotalScore = 0;
        int p1RollScore = 0;
        int p2RollScore = 0;

        // Play the game until a players score is greater than or equal to MAX_SCORE
        while (p1TotalScore < MAX_SCORE && p2TotalScore < MAX_SCORE) {
            // First player goes
            String choice = getPlayerChoice(console, "Player One");

            if (choice.equals("R")) { // Player rolled the die
                die.roll();
                System.out.println(die);
                p1RollScore = getRollScore(p1RollScore, die);
            } else { // Player adds current rolling score to total score
                p1TotalScore += p1RollScore;
                p1RollScore = 0;
            }

            // Second player goes
            choice = getPlayerChoice(console, "Player Two");

            if (choice.equals("R")) { // Player rolled the die
                die.roll();
                System.out.println(die);
                p2RollScore = getRollScore(p2RollScore, die);
            } else { // Player adds current rolling score to total score
                p2TotalScore += p2RollScore;
                p2RollScore = 0;
            }

            // Print the current scores for the players
            System.out.printf("Player one total score = %3d and roll score = %3d\n", p1TotalScore, p1RollScore);
            System.out.printf("Player two total score = %3d and roll score = %3d\n", p2TotalScore, p2RollScore);
        }

        // Print the winner
        if (p1TotalScore > p2TotalScore) {
            System.out.println("Player one wins with a score of " + p1TotalScore);
        } else {
            System.out.println("Player two wins with a score of " + p2TotalScore);
        }
    }

    // Returns the values roll score after rolling
    public static int getRollScore(int rollScore, Die die) {
        if (die.getValue() == 1) {
            rollScore = 0;
        } else {
            rollScore += die.getValue();
        }
        return rollScore;
    }

    // Have the player decide to roll or stop
    public static String getPlayerChoice(Scanner console, String playerName) {
        System.out.print(playerName + " (R)oll or (S)top: ");
        String choice = console.next();

        while (!choice.equals("R") && !choice.equals("S")) {
            System.out.print("Please choose 'R' or 'S': ");
        }

        return choice;
    }
}
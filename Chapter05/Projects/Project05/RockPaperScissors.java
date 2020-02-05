import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Welcome Message
        System.out.println("\nLet's Play Rock Paper Scissors!");
        System.out.println("R for rock, P for paper, S for Scissors, and Q to quit");

        // Create a console for user input
        Scanner console = new Scanner(System.in);

        // Play rock paper scissors until player decides to quit
        while (true) {
            // Get the computers and the players choices
            String computerChoice = getComputerChoice();
            String playerChoice = getPlayerChoice(console);

            // Exit the loop if the user chooses to quit
            if (playerChoice.equals("Q")) {
                break;
            }

            // Print the winner for the rount
            printWinner(computerChoice, "Computer", playerChoice, "Player");
        }
    }

    // Prints the winner of a round
    public static void printWinner(String p1Choice, String p1Name, String p2Choice, String p2Name) {
        System.out.print(p1Name + " chose " + p1Choice + ". ");
        if (p1Choice.equals("R")) {
            if (p2Choice.equals("R")) {
                System.out.println("Tie");
            } else if (p2Choice.equals("P")) {
                System.out.println(p2Name + " wins");
            } else { // p2Choice.equals("S")
                System.out.println(p1Name + " wins");
            }
        } else if (p1Choice.equals("P")) {
            if (p2Choice.equals("R")) {
                System.out.println(p1Name + " wins");
            } else if (p2Choice.equals("P")) {
                System.out.println("Tie");
            } else { // p2Choice.equals("S")
                System.out.println(p2Name + " wins");
            }
        } else { // p1Choice.equals("S")
            if (p2Choice.equals("R")) {
                System.out.println(p2Name + " wins");
            } else if (p2Choice.equals("P")) {
                System.out.println(p1Name + " wins");
            } else { // p2Choice.equals("S")
                System.out.println("Tie");
            }
        }
    }

    // Returns the Players choice for rock paper scissors
    public static String getPlayerChoice(Scanner console) {
        System.out.print("(R)ock, (P)aper, (S)cissors, or (Q)uit? ");
        String choice = console.next();

        while (!choice.equals("R") && !choice.equals("P") && !choice.equals("S") && !choice.equals("Q")) {
            System.out.print("Please enter R, P, S, or Q: ");
            choice = console.next();
        }

        return choice;
    }

    // Returns the computers choice for rock paper scissors
    public static String getComputerChoice() {
        Random rand = new Random();

        int choice = rand.nextInt(3);

        if (choice == 0) {
            return "R";
        } else if (choice == 1) {
            return "P";
        } else {
            return "S";
        }
    }
}
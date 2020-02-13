import java.util.*;

public class TicTacToe {
    public static final int MAX = 3;
    public static final int MIN = 1;
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner console = new Scanner(System.in);

        // Create a board for tic tac toe
        Board board = new Board();

        // Print the welcome message
        printWelcomeMessage();

        // Play ticTacToe
        play(board, console);
        
        // Print the winner
        printWinner(board);
    }

    // Prints the winner of the game
    public static void printWinner(Board board) {
        if (board.isWinner('X')) {
            System.out.println("X wins!");
        } else if (board.isWinner('O')) {
            System.out.println("O wins!");
        } else {
            System.out.println("No Winner");
        }
    }

    // Plays a two player game of tic tac toe
    public static void play(Board board, Scanner console) {
        // Keep playing until a winner emerges or board is full
        do {
            // Player 1 moves
            playerMove('X', board, console);

            // Print the board
            System.out.println("\n" + board);

            // Exit the game if X wins or board is full
            if (board.isFull() || board.isWinner('X')) {
                break;
            }

            // Player 2 moves
            playerMove('O', board, console);

            // Print the board
            System.out.println("\n" + board);

            // Exit the game if O wins or board is fulll
            if (board.isFull() || board.isWinner('O')) {
                break;
            }

        } while (true);
    }

    // Do a single move for a player
    // The board is index based zero, but the player will use index based 1
    // Adjustments made accordingly
    public static void playerMove(char player, Board board, Scanner console) {
        System.out.printf("%s's Move\n", player);
        int row = getInt(console, MIN, MAX, "Row: ");
        int column = getInt(console, MIN, MAX, "Col: ");

        while (!board.isClear(row - 1, column - 1)) {
            System.out.println("Oh no! You can't go there. Try again.");
            row = getInt(console, MIN, MAX, "Row: ");
            column = getInt(console, MIN, MAX, "Col: ");
        }

        board.placeXO(player, row - 1, column - 1);
    }

    // Prints the welcome message
    public static void printWelcomeMessage() {
        System.out.println("\nLet's play a game of Tic Tac Toe!\n");
    }
    
    // get an integer from the user between min and max inclusive
    public static int getInt(Scanner console, int min, int max, String message) {
        System.out.printf(message);
        int n = getInt(console);

        while (n < min || n > max) {
            System.out.printf("Please enter an integer between %d and %d inclusive: ", min, max);
            n = getInt(console);
        }

        return n;
    }
    
    // Get an integer from the user
    public static int getInt(Scanner console) {
        while (!console.hasNextInt()) {
            System.out.print("Please enter a valid integer: ");
            console.next();
        }

        return console.nextInt();
    }
}
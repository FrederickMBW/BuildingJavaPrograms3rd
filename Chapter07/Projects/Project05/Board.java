public class Board {
    public static final int SIZE = 3;
    public static final char CLEAR = ' ';

    private char[][] board;

    public Board() {
        // Create the board
        this.board = new char[SIZE][SIZE];

        // Fill the board
        this.clear();
    }

    // Clear the board
    public void clear() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                this.board[i][j] = CLEAR;
            }
        }
    }

    // Returns true if the given token won
    // Returns false otherwise
    public boolean isWinner(char xo) {
        // Count the number in a row
        int count = 0;

        // Check the horizontal rows
        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                if (this.board[row][column] == xo) {
                    count++;
                    if (count == 3) {
                        return true;
                    }
                } else {
                    count = 0;
                    break;
                }
            }
            count = 0;
        }

        // Check the vertical rows
        for (int column = 0; column < SIZE; column++) {
            for (int row = 0; row < SIZE; row++) {
                if (this.board[row][column] == xo) {
                    count++;
                    if (count == 3) {
                        return true;
                    }
                } else {
                    count = 0;
                    break;
                }
            }
            count = 0;
        }

        // Check the diagonals
        for (int i = 0; i < SIZE; i++) {
            if (this.board[i][i] == xo) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0;
                break;
            }
        }
        count = 0;

        for (int i = 0; i < SIZE; i++) {
            if (this.board[i][SIZE - i - 1] == xo) {
                count++;
                if (count == 3) {
                    return true;
                }
            } else {
                count = 0;
                break;
            }
        }
        count = 0;

        // Didn't find three in a row anywhere
        return false;
    }

    // Returns true if an element on the board is clear
    // Returns false otherwise
    public boolean isClear(int row, int column) {
        if (row < 0 || row > SIZE || column < 0 || column > SIZE) {
            throw new IllegalArgumentException();
        }

        return this.board[row][column] == CLEAR;
    }

    // Returns true if the board is full
    // Returns false otherwise
    public boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == CLEAR) {
                    return false;
                }
            }
        }
        return true;
    }

    // Place an X or O on the board
    // Returns true if the piece was placed on the board
    // Returns false otherwise
    public boolean placeXO(char xo, int row, int column) {
        if (row < 0 || row > SIZE || column < 0 || column > SIZE) {
            throw new IllegalArgumentException();
        }

        if (xo != 'X' && xo != 'O') {
            throw new IllegalArgumentException();
        }

        // Can't place the piece if there is already an X or O there
        if (!isClear(row, column)) {
            return false;
        }

        // Place the piece
        this.board[row][column] = xo;
        return true;
    }

    // String representation of the tick tack toe board
    public String toString() {
        String result = "";

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == CLEAR) {
                    result += "*";
                } else {
                    result += board[i][j];
                }
            }
            result += "\n";
        }

        return result;
    }
}
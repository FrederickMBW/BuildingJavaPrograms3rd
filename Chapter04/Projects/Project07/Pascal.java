public class Pascal {
    public static void main(String[] args) {
        // Get the height of the triangle from the command line
        int height = Integer.parseInt(args[0]);

        // Print the triangle
        printPascalTriangle(height);
    }

    public static void printPascalTriangle(int height) {
        for (int row = 0; row < height; row++) {
            // Print the whitespace to the left
            printChar(' ', 2 * height - 2 * row);

            for (int column = 0; column <= row; column++) {
                System.out.printf("%4d", getPascalValue(row, column));
            }
            System.out.println();
        }
    }

    // Return the value of pascals triangle when given the row and column
    public static int getPascalValue(int row, int column) {
        return factorial(row) / (factorial(column) * factorial(row - column));
    }

    // Return the factorial for a given number
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        int result = 1;

        for (int i = n; i > 1; i--) {
            result *= i;
        }

        return result;
    }

    // Print a charactor the given number of time
    public static void printChar(char c, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
}
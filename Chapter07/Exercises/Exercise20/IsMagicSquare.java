// Tested on Practice it
// https://practiceit.cs.washington.edu/\

public class IsMagicSquare {
    // Returns true if a given array is a magic square
    public static boolean isMagicSquare(int[][] a) {
        if (a == null) {
            throw new NullPointerException();
        }

        // Return true if size of matrix is zero
        if (a.length == 0) {
            return true;
        }

        // Return false if not a square matrix
        if (!isSquare(a)) {
            return false;
        }

        // Get the sum of the top row
        int topRowSum = 0;
        for (int i = 0; i < a[0].length; i++) {
            topRowSum += a[0][i];
        }

        // Return false if any of the rows do not add up to topRowSum
        for (int row = 1; row < a.length; row++) {
            int sum = 0;
            for (int column = 0; column < a[row].length; column++) {
                sum += a[row][column];
            }
            if (sum != topRowSum) {
                return false;
            }
        }

        // Return false if any of the columns do not add up to TopRowSum
        for (int column = 0; column < a.length; column++) {
            int sum = 0;
            for (int row = 0; row < a[0].length; row++) {
                sum += a[row][column];
            }
            if (sum != topRowSum) {
                return false;
            }
        }

        // Return false if the sum of the diagonals are not equal to the topRowSum
        // Diagonal 1
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][i];
        }
        if (sum != topRowSum) {
            return false;
        }

        // Diagonal 2
        sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][a.length - 1 - i];
        }
        if (sum != topRowSum) {
            return false;
        }

        // It is a magic square!
        return true;
        
    }

    // Return true if an array is square
    public static boolean isSquare(int[][] a) {
        if (a == null) {
            throw new NullPointerException();
        }

        // Return true with an empty array
        if (a.length == 0) {
            return true;
        }

        // Go through every row, and check that it's width is equal to the height
        for (int i = 0 ; i < a.length; i++) {
            if (a.length != a[i].length) {
                return false;
            }
        }

        // It's a square harry!
        return true;
    }
}
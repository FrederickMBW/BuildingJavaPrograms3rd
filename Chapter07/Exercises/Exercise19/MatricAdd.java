// Tested on Practice it
// https://practiceit.cs.washington.edu/\

import java.util.*;

public class MatricAdd {

    // Adds to matrixes together
    // Can assume matrixes are the same size
    public static int [][] matrixAdd(int[][] a1, int[][] a2) {
        if (a1.length < 1) {
            return new int[0][0];
        }

        // Create an array to hold the sum
        // I'll assume that it is NOT a jagged array
        int[][] sum = new int[a1.length][a1[0].length];

        // Add the the two arrays together and add to sum
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j <a1[i].length; j++) {
                sum[i][j] = a1[i][j] + a2[i][j];
            }
        }

        // Return the sum
        return sum;
    }
}
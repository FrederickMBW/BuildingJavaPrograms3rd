import java.util.*;

public class PrintSquares {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        printSquares(n);
    }

    public static void printSquares(int n) {
        printSquares(n, new ArrayList<Integer>(), 1);
    }

    private static void printSquares(int n, List<Integer> roots, int next) {
        if (getSquaredSum(roots) > n || Math.sqrt(n) + 1 < next) {
            return;
        } else if (getSquaredSum(roots) == n) {
            print(roots);
            return;
        }

        roots.add(next);
        printSquares(n, roots, next + 1);
        roots.remove(roots.size() - 1);

        printSquares(n, roots, next + 1);
    }

    // Returns the sum of all integers squared in a list
    private static int getSquaredSum(List<Integer> roots) {
        int sum = 0;
        for (int n : roots) {
            sum += n * n;
        }
        return sum;
    }

    // Print the roots in the format requested in the book
    private static void print(List<Integer> roots) {
        if (roots.size() > 0) {
            System.out.printf("%d^2", roots.get(0));
        }

        for (int i = 1; i < roots.size(); i++) {
            System.out.printf(" + %d^2", roots.get(i));
        }

        System.out.println();
    }
}
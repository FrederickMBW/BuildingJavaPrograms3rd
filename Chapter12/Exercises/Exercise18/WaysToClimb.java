import java.util.*;

public class WaysToClimb {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
    
        waysToClimb(n);
    }

    public static void waysToClimb(int n) {
        if (n < 1) {
            return;
        }

        waysToClimb(n, 0, new ArrayList<Integer>());
    }

    public static void waysToClimb(int n, int pos, ArrayList<Integer> moves) {
        if (pos == n) { // Print the solution
            System.out.println(moves);
        } else if (pos > n) {
            // Do nothing. Went too far
        } else {
            // Try one more step
            moves.add(1);
            waysToClimb(n, pos + 1, moves);
            moves.remove(moves.size() - 1);

            // Try two more steps
            moves.add(2);
            waysToClimb(n, pos + 2, moves);
            moves.remove(moves.size() - 1);
        }
    }

}
import java.util.*;

public class CountBinary {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        countBinary(n);
    }

    public static void countBinary(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }

        countBinary(n, 0, new int[n]);
    }

    public static void countBinary(int n, int pos, int[] binary) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }
        
        if (pos >= binary.length) {
            for (int i = 0; i < binary.length; i++) {
                System.out.print(binary[i]);
            }
            System.out.println();
            return;
        }

        // Try a zero
        binary[pos] = 0;
        countBinary(n, pos + 1, binary);

        // Try a one
        binary[pos] = 1;
        countBinary(n, pos + 1, binary);
    }
}
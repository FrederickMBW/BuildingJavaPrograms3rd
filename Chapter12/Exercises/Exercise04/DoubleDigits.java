import java.util.*;

public class DoubleDigits {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        System.out.println(doubleDigits(n));
    }

    public static int doubleDigits(int n) {
        if (n == 0) {
            return 0;
        } else if (n < 0) {
            return -doubleDigits(-n, 0);
        } else {
            return doubleDigits(n, 0);
        }
    }

    public static int doubleDigits(int n, int pos) {
        if (n == 0) {
            return n;
        } else if (n < 10) {
            return n * (int) Math.pow(10, pos) + n * (int) Math.pow(10, pos + 1);
        } else {
            return doubleDigits(n / 10, pos + 2) + n % 10 * (int) Math.pow(10, pos) + n % 10 * (int) Math.pow(10, pos + 1);
        }
    }
}
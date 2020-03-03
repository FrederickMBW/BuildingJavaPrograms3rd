public class EvenDigits {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        System.out.println(evenDigits(n));
    }

    public static int evenDigits(int n) {
        if (n < 0) {
            return -evenDigits(-n, 1);
        } else {
            return evenDigits(n, 1);
        }
    }

    private static int evenDigits(int n, int digit) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return n % 10 * digit + evenDigits(n / 10, digit * 10);
        } else {
            return evenDigits(n / 10, digit);
        }
    }
}
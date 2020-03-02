public class SumTo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        System.out.println(sumTo(n));
    }

    public static double sumTo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n == 0) {
            return 0;
        } else {
            return 1.0 / n + sumTo(n - 1);
        }
    }
}
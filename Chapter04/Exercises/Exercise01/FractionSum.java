public class FractionSum {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        System.out.println(fractionSum(n));
    }

    public static double fractionSum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }
}
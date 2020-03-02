public class MultiplyEvens {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        System.out.println(multiplyEvens(n));
    }

    public static int multiplyEvens(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }

        return multiplyEvens(n, 2);
    }

    public static int multiplyEvens(int n, int multiplier) {
        if (n == 1) {
            return multiplier;
        } else {
            return multiplier * multiplyEvens(n - 1, multiplier + 2);
        }
    }
}
public class SwapDigits {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        System.out.println(swapDigits(n));
    }

    // Swaps pairs of digits in an integer
    public static int swapDigits(int n) {
        // Keep track if the number is negative
        boolean isNegative = (n < 0);

        // Get the absolute value of the given integer
        n = Math.abs(n);

        // Keep track of the result and position
        int result = 0;
        int position = 1;

        // Swap pairs of digits
        while (n >= 10) {
            int n1 = n % 10;
            int n2 = (n / 10) % 10;

            result += position * n2 + position * 10 * n1;
            position *= 100;
            n /= 100;
        }

        // add the final digit to the number
        result += n * position;

        // Return the result
        return result;
    }
}
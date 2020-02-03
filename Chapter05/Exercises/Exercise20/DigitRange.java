public class DigitRange {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        System.out.println(digitRange(n));
    }

    // Returns the range of the digits in the given integer
    public static int digitRange(int n) {
        // Get the absolute value of the integer
        n = Math.abs(n);

        // Get the first digit to start with a max and min
        int min = n % 10;
        int max = min;

        // Go through the rest of the digits to find the min and max
        while (n > 0) {
            int next = n % 10;

            if (next > max) {
                max = next;
            } else if (next < min) {
                min = next;
            }

            n /= 10;
        }

        // Return the range
        return max - min + 1;

    }
}
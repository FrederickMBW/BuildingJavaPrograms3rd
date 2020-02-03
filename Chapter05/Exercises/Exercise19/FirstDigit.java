public class FirstDigit {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        System.out.println(firstDigit(n));
    }

    // Returns the sum of the the digits in the integer
    public static int firstDigit(int n) {
        // Get the absolute value of n
        n = Math.abs(n);

        // Remove all the digits excepts the first digit
        while (n >= 10) {
            n /= 10;
        }

        return n;
    }
}
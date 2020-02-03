public class DigitSum {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        System.out.println(digitSum(n));
    }

    // Returns the sum of the the digits in the integer
    public static int digitSum(int n) {
        // Get the absolute value of n
        n = Math.abs(n);

        // Keep track of the sum of the digits
        int sum = 0;

        // Add all the digits to the sum
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
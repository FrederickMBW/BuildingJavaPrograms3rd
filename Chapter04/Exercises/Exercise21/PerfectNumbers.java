public class PerfectNumbers {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        perfectNumbers(n);
    }

    // Print all the perfect numbers between 1 and n
    public static void perfectNumbers(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }

        //Print the intro
        System.out.print("Perfect numbers up to " + n + ": ");

        // Print all the perfect numbers
        for (int i = 1; i <= n; i++) {
            if(isPerfectNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Determine if a number is a perfect number
    public static boolean isPerfectNumber(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }

        // Track the sum of the factors
        int sum = 0;

        // Find all the factors for n and add them to the sum
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        // Return if the sum of the factors is equal to n
        return n == sum;
    }
}
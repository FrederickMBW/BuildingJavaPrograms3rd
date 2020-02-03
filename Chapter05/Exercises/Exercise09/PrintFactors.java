public class PrintFactors {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        printFactors(n);
    }

    // Print the factors of an integer
    public static void printFactors(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }

        // Print the first factor
        System.out.print("1");

        // Print all the remaing factors
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(" and " + i);
            }
        }

        System.out.println();
    }
}
public class ShowTwos {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        showTwos(n);
    }

    // Prints the factors of two for any given integer
    public static void showTwos(int n) {
        System.out.print(n + " = ");

        while (n % 2 == 0) {
            System.out.print("2 * ");
            n /= 2;
        }

        System.out.println(n);
    }
}
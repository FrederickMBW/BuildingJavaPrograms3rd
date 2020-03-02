public class StarString {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        starString(n);
    }

    public static void starString(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n == 0) {
            System.out.print('*');
        } else {
            starString(n - 1);
            starString(n - 1);
        }
    }
}
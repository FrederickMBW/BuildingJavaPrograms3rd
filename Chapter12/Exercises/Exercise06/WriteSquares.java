public class WriteSquares {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        writeSquares(n);
    }

    public static void writeSquares(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }

        if (n == 1) {
            System.out.print(n);
        } else if (n % 2 != 0) {
            System.out.print(n * n + ", ");
            writeSquares(n - 1);
        } else {
            writeSquares(n - 1);
            System.out.print(", " + (n * n));
        }
    }
}
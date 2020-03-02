public class WriteSequence {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        writeSequence(n);
    }

    public static void writeSequence(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }

        if (n == 1) {
            System.out.print("1 ");
        } else if (n == 2) {
            System.out.print("1 1 ");
        } else if (n % 2 == 0) {
            System.out.print(n / 2 + " ");
            writeSequence(n - 2);
            System.out.print(n / 2 + " ");
        } else {
            System.out.print((n + 1)/ 2 + " ");
            writeSequence(n - 2);
            System.out.print((n + 1)/ 2 + " ");
        }
    }
}
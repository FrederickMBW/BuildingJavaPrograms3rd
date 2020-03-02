public class WriteChars {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        writeChars(n);
    }

    public static void writeChars(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }

        if (n == 1) {
            System.out.print("*");
        } else if (n == 2) {
            System.out.print("**");
        } else {
            System.out.print("<");
            writeChars(n - 2);
            System.out.print(">");
        }
    }
}
public class WriteNum {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        writeNum(n);
    }

    public static void writeNum(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }

        if (n == 1) {
            System.out.print(n);
        } else {
            writeNum(n - 1);
            System.out.print(", " + n);
        }
    }
}
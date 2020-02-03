public class HopScotch {
    public static final int SPACES = 8;

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        hopScotch(n);
    }

    public static void hopScotch(int n) {
        // Print the 1 in the top row
        printChar(' ', SPACES / 2);
        System.out.println("1");

        // Print the rest of the rows
        int count = 2;

        for (int i = 0; i < n; i++) {
            System.out.print(count++);
            printChar(' ', SPACES - 1);
            System.out.println(count++);

            printChar(' ', SPACES / 2);
            System.out.println(count++);
        }

    }

    public static void printChar(char c, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
}
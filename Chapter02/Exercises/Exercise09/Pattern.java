public class Pattern {
    public static final int WIDTH = 40;

    public static void main(String[] args) {
        printLine();
        printPattern();
        printNumbers();
        printLine();
    }

    public static void printLine() {
        for (int i = 0; i < WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printPattern() {
        for (int i = 0; i < WIDTH / 4; i++) {
            System.out.print("_-^-");
        }
        System.out.println();
    }

    public static void printNumbers() {
        for (int i = 1; i <= WIDTH / 2; i++) {
            int digit = i % 10;
            System.out.print("" + digit + digit);
        }
        System.out.println();
    }
}
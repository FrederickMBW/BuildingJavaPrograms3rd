public class Window {
    public static final int SUB_HEIGHT = 10;

    public static void main(String[] args) {
        printLine();
        printWindow();
        printLine();
        printWindow();
        printLine();
    }

    public static void printLine() {
        System.out.print("+");
        printBars();
        System.out.print("+");
        printBars();
        System.out.println("+");
    }

    public static void printBars() {
        for (int i = 0; i < SUB_HEIGHT; i++) {
            System.out.print("=");
        }
    }

    public static void printWindow() {
        for (int i = 0; i < SUB_HEIGHT; i++) {
            printWindowLine();
        }
    }

    public static void printWindowLine() {
        System.out.print("|");
        printSpaces();
        System.out.print("|");
        printSpaces();
        System.out.println("|");
    }

    public static void printSpaces() {
        for (int i = 0; i < SUB_HEIGHT; i++) {
            System.out.print(" ");
        }
    }
}
// Example to run: "Java PrintNumbers 4"

public class PrintNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            printNumbers(Integer.parseInt(args[i]));
        }
    }

    public static void printNumbers(int max) {
        for (int i = 1; i <= max; i++) {
            System.out.print("[" + i + "] ");
        }
        System.out.println();
    }
}
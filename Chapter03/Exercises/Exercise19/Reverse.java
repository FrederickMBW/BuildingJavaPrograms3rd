public class Reverse {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            printReverse(args[i]);
        }
    }

    public static void printReverse(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
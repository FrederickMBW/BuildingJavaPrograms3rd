public class Repeat {
    public static void main(String[] args) {
        String s = args[0];
        int n = Integer.parseInt(args[1]);

        System.out.println(repeat(s, n));
    }

    public static String repeat(String s, int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n == 0) {
            return "";
        } else {
            return s + repeat(s, n - 1);
        }
    }
}
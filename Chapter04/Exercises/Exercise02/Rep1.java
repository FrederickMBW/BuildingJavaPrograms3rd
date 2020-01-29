public class Rep1 {
    public static void main(String[] args) {
        String s = args[0];
        int n = Integer.parseInt(args[1]);

        System.out.print(rep1(s, n));
    }

    public static String rep1(String s, int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }

        String result = s;
        for (int i = 1; i < n; i++) {
            result += s;
        }

        return result;
    }
}
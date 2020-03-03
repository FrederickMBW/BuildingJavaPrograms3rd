public class Permut {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);

        System.out.println(permut(n, r));
    }

    public static int permut(int n, int r) {
        if (n <= r || r < 1) {
            throw new IllegalArgumentException();
        }

        if (r == 1) {
            return n;
        } else {
            return n * permut(n - 1, r - 1);
        }
    }
}
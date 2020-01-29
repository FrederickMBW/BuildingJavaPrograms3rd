public class PrintRange {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        range(n1, n2);
    }

    public static void range(int n1, int n2) {
        if (n1 < n2) {
            for (int i = n1; i <= n2; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = n1; i >= n2; i--) {
                System.out.print(i + " ");
            }
        }
    }
}
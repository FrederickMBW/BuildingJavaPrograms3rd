public class NumUnique {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        System.out.print(numUnique(n1, n2, n3));
    }

    public static int numUnique(int n1, int n2, int n3) {
        if (n1 != n2 && n1 != n3 && n2 != n3) {
            return 3;
        } else if (n1 == n2 && n2 == n3) {
            return 1;
        } else {
            return 2;
        }
    }
}
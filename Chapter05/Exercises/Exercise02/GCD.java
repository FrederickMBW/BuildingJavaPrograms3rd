public class GCD {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        System.out.println(gcd(n1, n2));
    }

    public static int gcd(int n1, int n2) {
        // Throw an exception if given zero for either argument
        if (n1 == 0 || n2 == 0) {
            throw new IllegalArgumentException();
        }

        // Get the absolute values for n1 and n2
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);

        // Use Euclid's algorithm to find the gcd
        while (n1 != 0 && n2 != 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
        }

        if (n1 == 0) {
            return n2;
        } else {
            return n1;
        }
    }
}
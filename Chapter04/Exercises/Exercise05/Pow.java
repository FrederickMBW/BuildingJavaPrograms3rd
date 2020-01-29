public class Pow {
    public static void main(String[] args) {
        int base = Integer.parseInt(args[0]);
        int exp = Integer.parseInt(args[1]);

        System.out.println(pow(base, exp));
    }

    public static int pow (int base, int exp) {
        if (exp < 0) {
            throw new IllegalArgumentException();
        }

        int result = 1;

        for (int i = 0; i < exp; i++) {
            result *= base;
        }

        return result;
    }
}
public class Pow {
    public static void main(String[] args) {
        double base = Double.parseDouble(args[0]);
        int exp = Integer.parseInt(args[1]);

        System.out.println(pow(base, exp));
    }

    public static double pow (double base, int exp) {
        if (base == 0 && exp < 0) {
            throw new IllegalArgumentException();
        }

        double result = 1.0;

        if (exp > 0) {
            for (int i = 0; i < exp; i++) {
                result *= base;
            }
        } else {
            for (int i = 0; i > exp; i--) {
                result *= (1 / base);
            }
        }

        return result;
    }
}
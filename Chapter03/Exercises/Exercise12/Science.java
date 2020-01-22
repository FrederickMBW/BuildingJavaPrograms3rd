public class Science {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i += 2) {
            System.out.println(science(Double.parseDouble(args[i]), Double.parseDouble(args[i + 1])));
        }
    }

    public static double science(double base, double exponent) {
        double multiplier = 10;

        for (int i = 1; i < exponent; i++) {
            multiplier *= 10;
        }
        
        for (int i = 0; i >= exponent; i--) {
            multiplier /= 10;
        }
        return base * multiplier;
    }
}
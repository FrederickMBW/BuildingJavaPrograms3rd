// Example to run: "Java Quadratic 1 3 2" where the arguments are a, b, and c respectively

import java.lang.Math;

public class Quadratic {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i += 3) {
            quadratic(Double.parseDouble(args[i]), Double.parseDouble(args[i + 1]), Double.parseDouble(args[i + 2]));
        }
    }

    public static void quadratic(double a, double b, double c) {
        double discriminant = calculateDiscriminant(a, b, c);
        double x1 = (-b + discriminant) / (2 * a);
        double x2 = (-b - discriminant) / (2 * a);
        System.out.println("x = " + x1 + ", x = " + x2);
    }

    public static double calculateDiscriminant(double a, double b, double c) {
        return Math.sqrt(b * b - 4 * a * c);
    }
}
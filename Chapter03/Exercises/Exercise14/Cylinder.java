import java.lang.Math;

public class Cylinder {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i += 2) {
            System.out.println(cylinderSurfaceArea(Double.parseDouble(args[i]), Double.parseDouble(args[i + 1])));
        }
    }

    public static double cylinderSurfaceArea(double radius, double height) {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
}
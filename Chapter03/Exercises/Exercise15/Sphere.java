import java.lang.Math;

public class Sphere {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(sphereVolume(Double.parseDouble(args[i])));
        }
    }

    public static double sphereVolume(double radius) {
        return 4.0 / 3 * Math.PI * Math.pow(radius, 3);
    }
}
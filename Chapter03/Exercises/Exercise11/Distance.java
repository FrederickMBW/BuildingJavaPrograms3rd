import java.lang.Math;

public class Distance {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i += 4) {
            System.out.println(distance(Double.parseDouble(args[i]), Double.parseDouble(args[i + 1]), Double.parseDouble(args[i + 2]), Double.parseDouble(args[i + 3])));
        }
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
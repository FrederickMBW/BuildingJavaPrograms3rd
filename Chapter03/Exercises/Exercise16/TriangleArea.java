import java.lang.Math;

public class TriangleArea {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i += 3) {
            System.out.println(triangleArea(Double.parseDouble(args[i]), Double.parseDouble(args[i + 1]), Double.parseDouble(args[i + 2])));
        }
    }

    public static double triangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
}
import java.lang.Math;

public class Area {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(area(Double.parseDouble(args[i])));
        }
    }

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }
}
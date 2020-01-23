public class Triangle {
    public static void main(String[] args) {
        double length1 = Double.parseDouble(args[0]);
        double length2 = Double.parseDouble(args[1]);
        double length3 = Double.parseDouble(args[2]);

        double angle1 = getAngle(length1, length2, length3);
        double angle2 = getAngle(length2, length3, length1);
        double angle3 = getAngle(length3, length1, length2);
    }

    // Use the law of cosines to calculate the 
    public static double getAngle(double a, double b, double c) {

    }
}
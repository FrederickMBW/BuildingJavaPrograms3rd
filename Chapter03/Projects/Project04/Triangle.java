public class Triangle {
    public static void main(String[] args) {
        // Get the three side lengths from the arguments
        double length1 = Double.parseDouble(args[0]);
        double length2 = Double.parseDouble(args[1]);
        double length3 = Double.parseDouble(args[2]);

        // Calculate the degrees of the angles
        double angle1 = getAngle(length1, length2, length3);
        double angle2 = getAngle(length2, length3, length1);
        double angle3 = getAngle(length3, length1, length2);

        //Print out the degrees of the angles
        System.out.println("Angle1: " + angle1);
        System.out.println("Angle2: " + angle2);
        System.out.println("Angle3: " + angle3);
    }

    // Use the law of cosines to calculate the angle of C when given a, b, and c.
    public static double getAngle(double a, double b, double c) {
        return Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));
    }
}
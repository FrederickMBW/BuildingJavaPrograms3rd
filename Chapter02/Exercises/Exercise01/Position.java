public class Position {
    public static void main(String[] args) {
        double initialPosition = Double.parseDouble(args[0]);
        double initialVelocity = Double.parseDouble(args[1]);
        double acceleration = Double.parseDouble(args[2]);
        double time = Double.parseDouble(args[3]);

        double position = initialPosition + initialVelocity * time + 0.5 * acceleration * time * time;

        System.out.println("Position = " + position);
    }
}
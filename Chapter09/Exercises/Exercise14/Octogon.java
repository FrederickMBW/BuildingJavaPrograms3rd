// A class to represent a regular octogon
public class Octogon implements Shape {
    public static final int NUMER_OF_SIDES = 8;

    private int a;

    // Constructs a new octogon with givin the length of a side
    public Octogon(int a) {
        this.a = a;
    }

    // Returns the area of this octogon.
    public double getArea() {
        return 2 * (1 + Math.sqrt(2)) * a * a;
    }

    // Returns the perimeter of this octogon.
    public double getPerimeter() {
        return NUMER_OF_SIDES * a;
    }
}
// A class to represent a regular hexagon
public class Hexagon implements Shape {
    public static final int NUMER_OF_SIDES = 6;

    private int a;

    // Constructs a new hexagon with givin the length of a side
    public Hexagon(int a) {
        this.a = a;
    }

    // Returns the area of this octogon.
    public double getArea() {
        return (3 * Math.sqrt(3) / 2) * a * a;
    }

    // Returns the perimeter of this octogon.
    public double getPerimeter() {
        return NUMER_OF_SIDES * a;
    }
}
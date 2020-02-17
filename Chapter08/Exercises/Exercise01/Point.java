// A Point object represents a pair of (x, y) coordinates.

public class Point {
    private int x;
    private int y;

    // Constructs a new Point  at the origin
    public Point() {
        this(0, 0);
    }

    // Constructs a new point with the given (x, y) location
    public Point(int x, int y) {
        setLocation(x, y);
    }

    // returns the distance between this Point and (0, 0)
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Returns the x coordinate of the point
    public int getX() {
        return this.x;
    }

    // Returns the y coordinate of the point
    public int getY() {
        return this.y;
    }

    // sets this point's (x, y) location to the given values
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // returns a string representation of this point
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // shifts this point's location by the given amount
    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
    }
}
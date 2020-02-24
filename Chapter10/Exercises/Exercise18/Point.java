import java.util.*;

// A Point object represents a pair of (x, y) coordinates.

public class Point implements Comparable<Point> {
    private int x;
    private int y;

    // Constructs a new Point at the origin
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

    // Returns the quadrant of the x/y plane the current point falls int
    public int quadrant() {
        if (x > 0) {
            if (y > 0) {
                return 1;
            } else if (y < 0) {
                return 4;
            }
        } else if (x < 0) {
            if (y > 0) {
                return 2;
            } else if (y < 0) {
                return 3;
            }
        }
        return 0;
    }

    // Negates and swaps x and y coordinates
    public void flip() {
        int tempX = x;

        x = -y;
        y = -tempX;
    }

    // Returns the manhatton distance between this point and the given point
    public int manhattanDistance(Point other) {
        return Math.abs(x - other.x) + Math.abs(y - other.y);
    }

    // Returns true if the given point lines up vertically with this point
    public boolean isVertical(Point other) {
        return x == other.x;
    }

    // Returns the slope of a line between this point an another point
    public double slope(Point other) {
        if (isVertical(other)) {
            throw new IllegalArgumentException();
        }

        return (double) (other.y - y) / (other.x - x);
    }

    // Returns true if this point is collinier with the two given points
    public boolean isCollinear(Point p1, Point p2) {
        // Get the slopes between this point and the other two points
        double slope1 = slope(p1);
        double slope2 = slope(p2);

        return Math.abs(slope1 - slope2) < 0.0001;
    }

    public int compareTo(Point o) {
        if (this.y != o.y) {
            return this.y - o.y;
        } else {
            return this.x - o.x;
        }
    }
}
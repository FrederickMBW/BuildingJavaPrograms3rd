import java.awt.Point;

public class Line {
    Point p1;
    Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(int x1, int y1, int x2, int y2) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public String toString() {
        return "[" + "(" + p1.x + ", " + p1.y + ")" + ", " + "(" + p2.x + ", " + p2.y + ")" + "]";
    }

    public double getSlope() {
        if (p1.x == p2.x) {
            throw new IllegalArgumentException();
        }

        return (double) (p2.y - p1.y) / (p2.x - p1.x);
    }

    // Returns the slope of a line between this point an another point
    private double slope(Point p1, Point p2) {
        if (p1.x == p2.x) {
            throw new IllegalArgumentException();
        }

        return (double) (p2.y - p1.y) / (p2.x - p1.x);
    }

    // Returns true if this point is collinier with the two given points
    public boolean isCollinear(Point p) {
        // Get the slopes between this point and the other two points
        double slope1 = slope(p1, p);
        double slope2 = slope(p2, p);

        return Math.abs(slope1 - slope2) < 0.0001;
    }
}
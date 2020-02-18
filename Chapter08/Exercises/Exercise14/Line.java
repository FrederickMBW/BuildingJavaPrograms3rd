import java.awt.Point;

public class Line {
    Point p1;
    Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
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
}
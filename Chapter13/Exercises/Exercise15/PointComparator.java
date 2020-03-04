import java.util.*;
import java.awt.*;

public class PointComparator implements Comparator<Point> {
    public int compare(Point p1, Point p2) {
        double distance1 = Math.sqrt(p1.x * p1.x + p1.y + p1.y);
        double distance2 = Math.sqrt(p2.x * p2.x + p2.y + p2.y);

        if (distance1 == distance2) {
            return 0;
        } else if (distance1 < distance2) {
            return -1;
        } else {
            return 1;
        }
    }
}
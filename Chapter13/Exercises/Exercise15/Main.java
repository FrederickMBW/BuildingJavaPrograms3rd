import java.util.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Create an arraylist of Points
        ArrayList<Point> points = new ArrayList<Point>();

        // Create and add points to the array
        for (int i = 1; i < args.length; i += 2) {
            int x = Integer.parseInt(args[i - 1]);
            int y = Integer.parseInt(args[i]);
            points.add(new Point(x, y));
        }

        // Print the points in the array
        printPoints(points);

        // Sort the arraylist of points with my pointComparator class
        Collections.sort(points, new PointComparator());

        // Print the points in the array
        printPoints(points);
    }

    // Print all the points in a list
    public static void printPoints(ArrayList<Point> points) {
        for (Point p : points) {
            System.out.printf("(%d, %d) ", p.x, p.y);
        }
        System.out.println();
    }
}
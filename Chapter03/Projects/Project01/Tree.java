// Example to run: "Java Tree 3 7"
// This will create a tree with 7 segments that are 3 high
// First argument is the height of a tree segment
// Second argument is the number of segments
// The base is not symetric for small trees

public class Tree {
    public static void main(String[] args) {
        int segments = Integer.parseInt(args[0]);
        int segmentHeight = Integer.parseInt(args[1]);

        drawTree(segments, segmentHeight);
    }

    public static void drawTree(int segments, int segmentHeight) {
        // Calculate the max width of the tree
        int maxSegmentWidth = 2 * segmentHeight - 1 + 2 * (segments - 1);
        
        // Draw the segments of the tree top
        for (int i = 1; i <= segments; i++) {
            drawTreeSegment(i, segmentHeight, maxSegmentWidth);
        }

        // Draw the base of the tree
        drawTreeBase(maxSegmentWidth);
    }

    public static void drawTreeSegment(int segment, int segmentHeight, int maxSegmentWidth) {
        // Determing the starting width of the segment
        int segmentStartingWidth = 2 * segment - 1;

        // Draw each line of the tree segment
        for (int i = 0; i < segmentHeight; i++) {
            // Determine the number of stars on the lines
            int lineWidth = 2 * i + segmentStartingWidth;

            // Draw the spaces to the left
            for (int j = 0; j < (maxSegmentWidth - lineWidth) /2; j++) {
                System.out.print(" ");
            }

            // Draw the stars
            drawChars('*', lineWidth);

            // Go to the next line
            System.out.println();
        }
    }

    // Draws the base of the tree
    public static void drawTreeBase(int maxSegmentWidth) {
        // Draw the trunk
        for (int i = 0; i < 2; i++) {
            // Draw the spaces to the left
            drawChars(' ', maxSegmentWidth / 2);

            // Draw the trunk
            System.out.println("*");
        }

        // Draw the spaces to the left of the base
        drawChars(' ', maxSegmentWidth / 2 - 3);

        // Draw the base
        drawChars('*', 7);
    }

    // Draws a given char a given number of times
    public static void drawChars(char c, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
}
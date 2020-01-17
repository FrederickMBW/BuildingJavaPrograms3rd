public class StarFigure {
    public static final int HEIGHT = 5;

    public static void main(String[] args) {
        for (int i = 0; i < HEIGHT; i++) {
            // Draw left side
            for (int j = 0; j < -i + (HEIGHT - 1); j++) {
                System.out.print("////");
            }

            // Draw the inside
            for (int j = 0; j < i; j++) {
                System.out.print("********");
            }

            // Draw right side
            for (int j = 0; j < -i + (HEIGHT - 1); j++) {
                System.out.print("\\\\\\\\");
            }

            System.out.println();
        }
    }
}
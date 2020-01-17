public class SlashFigure {
    public static final int HEIGHT = 8;

    public static void main(String[] args) {
        for (int i = 0; i < HEIGHT; i++) {
            // Draw the left side
            for (int j = 0; j < i; j++) {
                System.out.print("\\\\");
            }

            // Draw the middle
            for (int j = 0; j < -4 * i + HEIGHT * 4 - 2; j++) {
                System.out.print("!");
            }

            // Draw the right side
            for (int j = 0; j < i; j++) {
                System.out.print("//");
            }

            // Finish the line
            System.out.println();
        }
    }
}
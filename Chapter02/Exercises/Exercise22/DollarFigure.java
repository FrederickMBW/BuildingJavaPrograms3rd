public class DollarFigure {
    public static final int HEIGHT = 7;

    public static void main(String[] args) {
        for (int i = 0; i < HEIGHT; i++) {
            // Draw left *'s
            for (int j = 0; j < i * 2; j++) {
                System.out.print("*");
            }

            // Draw left $'s
            for (int j = 0; j < HEIGHT - i; j++) {
                System.out.print("$");
            }

            // Draw Middle
            for (int j = 0; j < (HEIGHT - i) * 2; j++) {
                System.out.print("*");
            }

            // Draw right $'s
            for (int j = 0; j < HEIGHT - i; j++) {
                System.out.print("$");
            }

            // Draw left *'s
            for (int j = 0; j < i * 2; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
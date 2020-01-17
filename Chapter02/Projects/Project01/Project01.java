public class Project01 {
    public static final int HEIGHT = 24;

    public static void main(String[] args) {
        for (int i = 0; i < HEIGHT; i++) {
            // Draw the left stars
            for (int j = 0; j < HEIGHT - i - 1; j++) {
                System.out.print("*");
            }

            // Draw the left spaces
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            // Draw the back slashes
            for (int j = 0; j < -i + HEIGHT - 1; j++) {
                System.out.print("//");
            }

            // Draw the slashes
            for (int j = 0; j < i; j++) {
                System.out.print("\\\\");
            }

            // Draw the right spaces
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            // Draw the right stars
            for (int j = 0; j < HEIGHT - i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
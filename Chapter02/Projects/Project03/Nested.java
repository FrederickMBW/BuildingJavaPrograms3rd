public class Nested {
    public static final int SUB_HEIGHT = 5;

    public static void main(String[] args) {
        drawLine();
        drawConeTop();
        drawConeBtm();
        drawLine();
        drawConeBtm();
        drawConeTop();
        drawLine();
    }

    public static void drawLine() {
        System.out.print("+");
        for (int i = 0; i < 2 * SUB_HEIGHT + 1; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void drawConeTop() {
        for (int i = 0; i < SUB_HEIGHT; i++) {
            // Draw left side
            System.out.print("|");

            // Draw left spaces
            for (int j = SUB_HEIGHT; j > i; j--) {
                System.out.print(" ");
            }

            // Draw left backslashes
            for (int j = 0; j < i; j++) {
                System.out.print("/");
            }

            // Draw center star
            System.out.print("*");

            // Draw right slashes
            for (int j = 0; j < i; j++) {
                System.out.print("\\");
            }

            // Draw right spaces
            for (int j = SUB_HEIGHT; j > i; j--) {
                System.out.print(" ");
            }

            // Draw right side
            System.out.println("|");
        }
    }

    public static void drawConeBtm() {
        for (int i = 0; i < SUB_HEIGHT; i++) {
            // Draw left side
            System.out.print("|");

            // Draw left spaces
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }

            // Draw left slashes
            for (int j = 0; j < -i + SUB_HEIGHT - 1; j++) {
                System.out.print("\\");
            }

            // Draw center star
            System.out.print("*");

            // Draw right backslashes
            for (int j = 0; j < -i + SUB_HEIGHT - 1; j++) {
                System.out.print("/");
            }

            // Draw right spaces
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }

            // Draw right side
            System.out.println("|");
        }
    }
}
public class Nested {
    public static final int HEIGHT = 15;

    public static void main(String[] args) {
        drawLine();
        drawTop();
        drawTop();
        drawLine();
        drawBottom();
        drawBottom();
        drawLine();
    }

    public static void drawLine() {
        System.out.print("+");
        for (int i = 0; i < 2 * HEIGHT; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void drawTop() {
        for (int i = 0; i < HEIGHT; i++) {

            // print the left side
            System.out.print("|");

            // print the left spaces
            for (int j = HEIGHT - i - 1; j > 0; j--) {
                System.out.print(" ");
            }

            // print the left ^
            System.out.print("^");

            // print the center spaces
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }

            // print the right ^
            System.out.print("^");

            // print the right spaces
            for (int j = HEIGHT - i - 1; j > 0; j--) {
                System.out.print(" ");
            }

            // print the right side
            System.out.println("|");
        }
    }

    public static void drawBottom() {
        for (int i = 0; i < HEIGHT; i++) {

            // print the left side
            System.out.print("|");

            // print the left spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // print the left v
            System.out.print("^");

            // print the center spaces
            for (int j = 0; j < HEIGHT * 2 - 2 * i - 2; j++) {
                System.out.print(" ");
            }

            // print the right v
            System.out.print("^");

            // print the right spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // print the right side
            System.out.println("|");
        }
    }
}
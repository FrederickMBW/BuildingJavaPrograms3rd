public class Rocket {
    public static final int SIZE = 3;

    public static void main(String[] args) {
        drawCone();
        drawRocketBody();
        drawCone();
    }

    public static void drawCone() {
        for (int i = 0; i < 2 * SIZE - 1; i++) {
            //Draw the left spaces
            for (int j = 0; j < SIZE * 2 - 1 - i; j++) {
                System.out.print(" ");
            }
            
            //Draw the left slashes
            for (int j = 0; j <= i; j++) {
                System.out.print("/");
            }

            //Draw the center
            System.out.print("**");

            //Draw the right slashes
            for (int j = 0; j <= i; j++) {
                System.out.print("\\");
            }

            //Draw the right spaces
            for (int j = 0; j < SIZE * 2 - 1 - i; j++) {
                System.out.print(" ");
            }
            //Print return
            System.out.println();
        }
    }

    public static void drawLine() {
        System.out.print("+");
        for (int i = 0; i < SIZE ; i++) {
            System.out.print("=*=*");
        }
        System.out.println("+");
    }

    public static void drawRocketBody() {
        drawLine();
        drawBoxTop();
        drawBoxBottom();
        drawLine();
        drawBoxBottom();
        drawBoxTop();
        drawLine();
    }

    public static void drawBoxTop() {
        for (int i = 0; i < SIZE; i++) {

            //Draw the left side
            System.out.print("|");

            //Draw the left dots
            for (int j = 0; j < -i + SIZE - 1; j++) {
                System.out.print("*");
            }

            //Draw the left cones
            for (int j = 0; j <= i; j++) {
                System.out.print("/\\");
            }

            //Draw the center dots
            for (int j = 0; j < -i + SIZE - 1; j++) {
                System.out.print("**");
            }

            //Draw the right cones
            for (int j = 0; j <= i; j++) {
                System.out.print("/\\");
            }

            //Draw the right dots
            for (int j = 0; j < -i + SIZE - 1; j++) {
                System.out.print("*");
            }

            //Draw the right side
            System.out.println("|");
        }
    }

    public static void drawBoxBottom() {
        for (int i = 0; i < SIZE; i++) {
            //Draw the left side
            System.out.print("|");

            //Draw the left dots
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            //Draw the left cones
            for (int j = 0; j < SIZE - i; j++) {
                System.out.print("\\/");
            }

            //Draw the center dots
            for (int j = 0; j < i; j++) {
                System.out.print("**");
            }

            //Draw the right cones
            for (int j = 0; j < SIZE - i; j++) {
                System.out.print("\\/");
            }

            //Draw the right dots
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            //Draw the right side
            System.out.println("|");
        }
    }
}
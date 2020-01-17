public class SpaceNeedle {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        drawCenterLine();
        drawTop();
        drawBottom();
        drawCenterLine();
        drawLeg();
        drawTop();
    }

    public static void drawCenterLine() {
        for (int i = 0; i < SIZE; i++) {
            //Draw the spaces to the left
            for (int j = 0; j < SIZE; j++) {
                System.out.print("   ");
            }

            //Draw the line
            System.out.println("||");
        }
    }

    public static void drawTop() {
        for (int i = 0; i < SIZE; i++) {
            //Draw the spaces to the left
            for (int j = 0; j < SIZE - i - 1; j++) {
                System.out.print("   ");
            }

            //Draw the left side
            System.out.print("__/");

            //Draw the left colons
            for (int j = 0; j < i; j++) {
                System.out.print(":::");
            }

            //Draw the middle
            System.out.print("||");

            //Draw the right colons
            for (int j = 0; j < i; j++) {
                System.out.print(":::");
            }

            //Draw the right side
            System.out.print("\\__");

            System.out.println();
        }

        //Draw the top's bottom
        System.out.print("|");

        for (int i = 0; i < SIZE; i++) {
            System.out.print("\"\"\"\"\"\"");
        }

        System.out.println("|");
    }

    public static void drawBottom() {
        for (int i = 0; i < SIZE; i++) {
            //Draw the spaces to the left
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            
            //Draw the left side
            System.out.print("\\_/");

            //Draw the middle
            for (int j = 0; j < -2 * i + 3 * SIZE - 2; j++) {
                System.out.print("\\/");
            }

            //Draw the right side
            System.out.println("\\_/");
        }
    }

    public static void drawLeg() {
        for (int i = 0; i < 4 * SIZE; i++) {
            //Draw the spaces to the left
            for (int j = 0; j < SIZE - 1; j++) {
                System.out.print("   ");
            }

            //Print out the leg
            System.out.println("|%%||%%|");
        }
    }
}
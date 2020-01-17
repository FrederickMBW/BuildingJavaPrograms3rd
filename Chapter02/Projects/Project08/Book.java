public class Book {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        drawCover();
        drawCore();
    }

    public static void drawCover() {
        // Draw the top line
        for (int i = 0; i < SIZE + 1; i++) {
            System.out.print(" ");
        }

        System.out.print("+");

        for (int i = 0; i < SIZE * 3; i++) {
            System.out.print("-");
        }

        System.out.println("+");

        // Draw the cover
        for (int i = 0; i < SIZE; i++) {
            // Draw the spaces to the left of the cover
            for (int j = 0; j < SIZE - i; j++) {
                System.out.print(" ");
            }

            // Draw the dash
            System.out.print("/");

            // Draw the spaces in the book cover
            for (int j = 0; j < SIZE - i - 1; j++) {
                System.out.print("   ");
            }

            // Draw the three underscores
            System.out.print("___");

            // Draw the shading on the cover
            for (int j = 0; j < i; j++) {
                System.out.print("/__");
            }

            // Draw the book pages
            for (int j = 0; j <= i; j++) {
                System.out.print("/");
            }

            System.out.println();
        }
    }

    public static void drawCore() {
        // Draw the edge of the book
        System.out.print("+");

        for (int i = 0; i < SIZE * 3; i++) {
            System.out.print("-");
        }

        System.out.print("+");

        for (int i = 0; i < SIZE; i++) {
            System.out.print("/");
        }

        System.out.println();

        // Draw the pages of the book
        for (int i = 0; i < SIZE / 2; i++) {
            // Draw the right edge of the book
            System.out.print("|");

            // Draw the spaces to the left
            for (int j = 0; j < (SIZE * 3 - 22) / 2; j++) {
                System.out.print(" ");
            }

            // Draw the title of the book
            System.out.print("Building Java Programs");

            // Draw the spaces to the right
            for (int j = 0; j < (SIZE * 3 - 22) / 2; j++) {
                System.out.print(" ");
            }

            // Draw the right edge of the book
            System.out.print("|");

            // Draw the pages of the book
            for (int j = 0; j < SIZE - 2 * i; j++) {
                System.out.print("/");
            }

            // Goto the next line
            System.out.println();
        }

        // Draw the edge of the book
        System.out.print("+");

        for (int i = 0; i < SIZE * 3; i++) {
            System.out.print("-");
        }

        System.out.print("+");

        System.out.println();
    }
}
public class Xo {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        
        xo(size);
    }

    public static void xo(int size) {
        for (int row = 0; row < size; row++) {
            // Draw the left o
            if (row < size / 2) {
                drawChar('o', row);
            } else {
                drawChar('o', size - row - 1);
            }

            // Draw the left x
            System.out.print('x');

            // Draw the middle o
            if (row < size / 2) {
                drawChar('o', -2 * row + size - 2);
            } else {
                drawChar('o', 2 * row - size);
            }


            // Draw the right x
            if (size % 2 != 0 && row == size  / 2) {
                // Do nothing
            } else {
                System.out.print('x');
            }

            // Draw the right o
            if (row < size / 2) {
                drawChar('o', row);
            } else {
                drawChar('o', size - row - 1);
            }

            // Goto next line
            System.out.println();
        }
    }

    public static void drawChar(char c, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
}
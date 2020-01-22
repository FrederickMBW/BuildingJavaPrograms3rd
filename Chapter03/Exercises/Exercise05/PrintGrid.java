// Example to run: "Java PrintGrid 4 6"

public class PrintGrid {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i += 2) {
            printGrid(Integer.parseInt(args[i]), Integer.parseInt(args[i + 1]));
        }
    }

    public static void printGrid(int rows, int columns) {
        for (int row = 1; row <= rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.print(row + rows * column + " ");
            }
            System.out.println();
        }
    }
}
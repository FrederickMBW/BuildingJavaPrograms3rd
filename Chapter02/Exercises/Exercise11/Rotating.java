public class Rotating {
    public static final int WIDTH = 60;
    public static final int RANGE = 7;

    public static void main(String[] args) {
        drawBars();
        drawNumbers();
    }

    public static void drawBars() {
        for (int i = 0; i < WIDTH / (RANGE + 1); i++) {
            for (int j = 0; j < RANGE; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
    }

    public static void drawNumbers() {
        for (int i = 1; i <= WIDTH / (RANGE + 1); i++) {
            for (int j = 1; j <= RANGE; j++) {
                System.out.print(j);
            }
            System.out.print("0");
        }
        System.out.println();
    }
}
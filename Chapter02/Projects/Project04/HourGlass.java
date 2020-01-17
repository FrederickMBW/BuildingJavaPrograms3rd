public class HourGlass {
    public static final int SUB_HEIGHT = 4;

    public static void main(String[] args) {
        drawLine();
        drawTop();
        drawConnector();
        drawBottom();
        drawLine();
        }

    public static void drawLine() {
        System.out.print("|");

        for (int i = 0; i < 2 * SUB_HEIGHT + 2; i++) {
            System.out.print("\"");
        }

        System.out.println("|");
    }

    public static void drawTop() {

        for (int i = 0; i < SUB_HEIGHT; i++) {
            //Draw left spaces
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            //Draw left slash
            System.out.print("\\");

            //Draw Center
            for (int j = 0; j <  -i + SUB_HEIGHT; j++) {
                System.out.print("::");
            }

            //Draw right slash
            System.out.print("/");

            //Draw right spaces
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void drawConnector() {
        //Draw left spaces
        for (int i = 0; i < SUB_HEIGHT + 1; i++) {
            System.out.print(" ");
        }

        //Draw connector
        System.out.print("||");

        //Draw the right spaces
        for (int i = 0; i < SUB_HEIGHT + 1; i++) {
            System.out.print(" ");
        }

        System.out.println();
    }

    public static void drawBottom() {
        for (int i = 0; i < SUB_HEIGHT; i++) {
            //Draw left spaces
            for (int j = 0; j < -i + SUB_HEIGHT; j++) {
                System.out.print(" ");
            }

            //Draw left slash
            System.out.print("/");

            //Draw middle
            for (int j = 0; j <= i; j++) {
                System.out.print("::");
            }

            //Draw right slash
            System.out.print("\\");

            //Draw right spaces
            for (int j = 0; j < -i + SUB_HEIGHT; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
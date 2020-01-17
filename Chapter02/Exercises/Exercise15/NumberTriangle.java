public class NumberTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // Print the dashes on the left
            for (int j = 0; j < -i + 6; j++) {
                System.out.print("-");
            }

            // Print the numbers
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(2 * i - 1);
            }

            // Print the dashes on the left
            for (int j = 0; j < -i + 6; j++) {
                System.out.print("-");
            }

            System.out.println();
        }
    }
}
public class Nested {
    public static final int REPEAT = 4;

    public static void main(String[] args) {
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < REPEAT; j++) {
                System.out.print(i);
            }
        }
        System.out.println();
    }
}
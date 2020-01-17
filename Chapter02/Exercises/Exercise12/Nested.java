public class Nested {
    public static final int REPEAT = 3;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < REPEAT; j++) {
                System.out.print(i);
            }
        }
        System.out.println();
    }
}
public class Angled {
    public static final int HEIGHT = 5;
    public static void main(String[] args) {
        for (int i = 1; i <= HEIGHT; i++) {
            for (int j = HEIGHT; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}
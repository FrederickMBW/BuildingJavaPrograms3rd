public class Squares {
    public static void main(String[] args) {
        int square = 0;
        for(int i = 1; i <= 10; i++) {
            square += 2 * i - 1;
            System.out.print(square + " ");
        }
    }
}
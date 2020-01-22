// Example to run: "Java PrintSquare 3 7"
// Only works for positive single digit numbers

public class PrintSquare {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i += 2) {
            printSquare(Integer.parseInt(args[i]), Integer.parseInt(args[i + 1]));
        }
    }

    public static void printSquare(int min, int max) {
        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for (int j = min; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
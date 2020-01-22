// Example to run: "Java PrintPowersOfN 4 3"

public class PrintPowersOfN {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i += 2) {
            printPowersOfN(Integer.parseInt(args[i]), Integer.parseInt(args[i + 1]));
        }
    }

    public static void printPowersOfN(int base, int power) {
        int current = 1;
        for (int i = 0; i <= power; i++) {
            System.out.print(current + " ");
            current *= base;
        }
        System.out.println();
    }
}
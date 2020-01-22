// Example to run: "Java PrintPowersOf2 4"

import java.lang.*;

public class PrintPowersOf2 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            printPowersOf2(Integer.parseInt(args[i]));
        }
    }

    public static void printPowersOf2(int power) {
        for (int i = 0; i <= power; i++) {
            int result = (int) Math.pow(2, i);
            System.out.print(result + " ");
        }
        System.out.println();
    }
}
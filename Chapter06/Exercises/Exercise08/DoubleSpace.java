import java.io.PrintStream;
import java.util.*;

public class DoubleSpace {
    public static void main(String[] args) {
        Scanner input = new Scanner(args[0]);
        PrintStream output = new PrintStream(System.out);

        doubleSpace(input, output);
    }

    public static void doubleSpace(Scanner input, PrintStream output) {
        if (input.hasNextLine()) {
            output.println(input.nextLine());
        }

        while (input.hasNextLine()) {
            output.println("\n" + input.nextLine());
        }
    }
}
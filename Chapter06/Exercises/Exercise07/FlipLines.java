import java.util.*;

public class FlipLines {
    public static void main(String[] args) {
        Scanner input = new Scanner(args[0]);

        flipLines(input);
    }

    public static void flipLines(Scanner input) {
        while (input.hasNextLine()) {
            String line1 = input.nextLine();

            if (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }

            System.out.println(line1);
        }
    }
}
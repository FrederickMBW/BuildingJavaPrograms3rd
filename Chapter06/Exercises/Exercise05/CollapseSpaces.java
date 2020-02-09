import java.util.*;

public class CollapseSpaces {
    public static void main(String[] args) {
        Scanner input = new Scanner(args[0]);

        collapseSpaces(input);
    }

    public static void collapseSpaces(Scanner input) {
        if (input.hasNext()) {
            System.out.print(input.next());
        }

        while (input.hasNext()) {
            System.out.print(" " + input.next());
        }

        System.out.println();
    }
}
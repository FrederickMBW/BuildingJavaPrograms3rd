import java.util.*;
import java.io.*;

public class PrintDuplicates {
    public static void main(String[] args) throws FileNotFoundException {
        // Get the file from the command line and create a scanner from it
        Scanner input = new Scanner(new File(args[0]));

        // Print the consectutive words in each line
        printDuplicates(input);
    }

    // Print the consectutive words and their count
    public static void printDuplicates(Scanner input) {
        while (input.hasNextLine()) {
            printDuplicates(input.nextLine());
        }
    }

    // Print the consectutive words and their count
    public static void printDuplicates(String input) {
        Scanner line = new Scanner(input);

        String last = "";
        int count = 1;

        if (line.hasNext()) {
            last = line.next();
        }

        while (line.hasNext()) {
            String next = line.next();

            if (last.equals(next)) {
                count++;
            } else if (count > 1) {
                System.out.print(last + "*" + count + " ");
                last = next;
                count = 1;
            } else {
                last = next;
                count = 1;
            }
        }

        if (count > 1) {
            System.out.print(last + "*" + count + " ");
        }

        System.out.println();
    }
}
import java.util.*;

public class ReadEntireFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(args[0]);

        System.out.println(readEntireFile(input));
    }

    public static String readEntireFile(Scanner input) {
        StringBuffer result = new StringBuffer();

        if (input.hasNextLine()) {
            result.append(input.nextLine());
        }

        while (input.hasNextLine()) {
            result.append("\n" + input.nextLine());
        }

        return result.toString();
    }
}
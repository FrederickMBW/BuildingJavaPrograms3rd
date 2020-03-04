import java.util.Comparator;
import java.util.Scanner;

public class MyStringComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        return getTokenNumber(s1) - getTokenNumber(s2);
    }

    // Returns the number of words in a string
    // Assumes the String is formatted correctly
    private int getTokenNumber(String s) {
        Scanner input = new Scanner(s);
        return Integer.parseInt(input.next());
    }
}
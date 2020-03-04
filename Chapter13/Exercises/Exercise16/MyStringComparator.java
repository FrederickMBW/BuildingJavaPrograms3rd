import java.util.Comparator;
import java.util.Scanner;

public class MyStringComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        return wordCount(s1) - wordCount(s2);
    }

    // Returns the number of words in a string
    private int wordCount(String s) {
        Scanner input = new Scanner(s);

        int words = 0;

        while (input.hasNext()) {
            words++;
            input.next();
        }

        input.close();

        return words;
    }
}
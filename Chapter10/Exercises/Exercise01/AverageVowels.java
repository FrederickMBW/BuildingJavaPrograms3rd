import java.util.*;

public class AverageVowels {
    public static double averageVowels(ArrayList<String> list) {
        if (list == null || list.size() == 0) {
            return 0.0;
        }

        int numberOfVowels = 0;
        int stringCount = 0;

        for (String s : list) {
            stringCount++;

            for (int i = 0; i < s.length(); i++) {
                if (isVowel(s.charAt(i))) {
                    numberOfVowels++;
                }
            }
        }

        return 1.0 * numberOfVowels / stringCount;
    }

    public static boolean isVowel(char c) {
        c = Character.toUpperCase(c);

        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
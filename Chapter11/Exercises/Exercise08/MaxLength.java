import java.util.*;

public class MaxLength {
    public static int maxLength(Set<String> set) {
        int max = 0;

        for (String s : set) {
            if (s.length() > max) {
                max = s.length();
            }
        }

        return max;
    }
}
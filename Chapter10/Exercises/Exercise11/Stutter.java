import java.util.*;

public class Stutter {
    public static void stutter(ArrayList<String> list, int k) {
        if (k <= 0) {
            list.clear();
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            for (int j = 1; j < k; j++) {
                list.add(i, list.get(i));
            }
        }
    }
}
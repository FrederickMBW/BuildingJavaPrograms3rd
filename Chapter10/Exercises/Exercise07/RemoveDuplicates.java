import java.util.*;

public class RemoveDuplicates {
    public static void removeDuplicates(ArrayList<String> list) {
        if (list == null || list.size() == 0) {
            return;
        }

        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) == list.get(i - 1)) {
                list.remove(i);
            }
        }
    }
}
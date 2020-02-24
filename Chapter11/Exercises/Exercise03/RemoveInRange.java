import java.util.*;

public class RemoveInRange {
    public static void removeInRange(LinkedList<Integer> list, int value, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            if (list.get(i) == value) {
                list.remove(i);
            }
        }
    }
}
import java.util.*;

public class InterLeave {
    public static void interleave(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int minSize = Math.min(list1.size(), list2.size());

        for (int i = 0; i < minSize; i++) {
            list1.add(2 * i + 1, list2.get(i));
        }

        for (int i = minSize; i < list2.size(); i++) {
            list1.add(list2.get(i));
        }
    }
}
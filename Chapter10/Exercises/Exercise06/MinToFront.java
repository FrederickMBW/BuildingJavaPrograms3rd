import java.util.*;

public class MinToFront {
    public static void minToFront(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return;
        }

        // Keep track of the min and its position
        int pos = 0;
        int min = list.get(0);

        // Find the min and its position
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
                pos = i;
            }
        }

        // Move the min to the front
        list.remove(pos);
        list.add(0, min);
    }
}
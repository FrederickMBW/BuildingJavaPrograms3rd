import java.util.*;

public class RemoveInRange {
    public static void removeInRange(List<Integer> list, int value, int start, int end) {
        // Create an iterator to go through the list
        Iterator<Integer> itr = list.iterator();

        // Move the iterator to the start position
        for (int i = 0; i < start; i++) {
            itr.next();
        }

        // Go through and remove any elements equal to the value between
        // the starting and ending index
        for (int i = 0; i < end - start; i++) {
            if (itr.next() == value) {
                itr.remove();
            }
        }
    }
}
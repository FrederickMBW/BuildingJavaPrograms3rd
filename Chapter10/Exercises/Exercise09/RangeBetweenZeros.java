import java.util.*;

public class RangeBetweenZeros {
    public static int rangeBetweenZeros(ArrayList<Integer> list) {
        // Return zero if list is null or list is size 0
        if (list == null || list.size() == 0) {
            return 0;
        }

        // return zero if the list doesn't contain 0
        if (!list.contains(0)) {
            return 0;
        }

        // return the distance bettween the first and last zero plus one
        return list.lastIndexOf(0) - list.indexOf(0) + 1;
    }
}
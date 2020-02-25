import java.util.*;

public class CountCommon {
    public static int countCommon(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set = new HashSet<Integer>(list1);

        set.retainAll(list2);

        return set.size();
    }
}
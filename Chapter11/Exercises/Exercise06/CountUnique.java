import java.util.*;

public class CountUnique {
    public static int countUnique(List<Integer> list) {
        return new HashSet<Integer>(list).size();
    }
}
import java.util.*;

public class Intersect {
    public static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
        // Find the intersection of the keys
        Set<String> intersection = map1.keySet();
        intersection.retainAll(map2.keySet());

        // Find the intersection of the key value pairs and record in a map
        Map<String, Integer> result = new HashMap<String, Integer>();

        for (String s : intersection) {
            if (map1.get(s) == map2.get(s)) {
                result.put(s, map1.get(s));
            }
        }

        return result;
    }
}
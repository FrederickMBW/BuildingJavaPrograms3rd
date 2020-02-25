import java.util.*;

public class SubMap {
    public static boolean subMap(Map<String, String> map1, Map<String, String> map2) {
        for (String s : map1.keySet()) {
            if (!map2.containsKey(s) || !map1.get(s).equals(map2.get(s))) {
                return false;
            }
        }
        return true;
    }
}
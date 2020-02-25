import java.util.*;

public class Is1to1 {
    public static boolean is1to1(Map<String, String> map) {
        Set<String> keys = map.keySet();
        Set<String> value = new HashSet<String>(map.values());

        return keys.size() == value.size();
    }
}
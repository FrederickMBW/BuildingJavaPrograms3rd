import java.util.*;

public class IsUnique {
    public static boolean isUnique(Map<String, String> map) {
        Set<String> keys = map.keySet();
        Set<String> value = new HashSet<String>(map.values());

        return keys.size() == value.size();
    } 
}
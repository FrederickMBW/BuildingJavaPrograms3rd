import java.util.*;

public class Contains3 {
    public static boolean contains3(List<String> list) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        // Go through every string in the list
        // If the string has been seen before, add 1 to it's count
        // If the string hasn't been seen, add it too the map with a count of 1
        for (String s : list) {
            if (map.containsKey(s)) {
                // Return true if the count == 2
                if (map.get(s) >= 2) {
                    return true;
                }

                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        // Did not find a string that occurs three or more times
        return false;
    }
}
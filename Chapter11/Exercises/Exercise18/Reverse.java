import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        for (int i = 1; i < args.length; i += 2) {
            map.put(args[i - 1], args[i]);
        }

        System.out.println("Map: " + map);
        
        System.out.println("Reverse the Map");
        Map<String, Set<String>> result = reverse(map);

        System.out.println("Map: " + map);
        System.out.println("Reversed: " + result);
    }

    public static Map<String, Set<String>> reverse(Map<String, String> map) {
        // Create the resulting map
        Map<String, Set<String>> result = new HashMap<String, Set<String>>();

        // Reverse the original map
        for (String s : map.keySet()) {
            // Create a new key/value pair in the result if the value in the original
            // map is not a key in the result.
            if (!result.containsKey(map.get(s))) {
                result.put(map.get(s), new HashSet<String>());
            }

            // Add the key from the given map as a value to the
            // resulting map
            result.get(map.get(s)).add(s);
        }

        return result;
    }
}
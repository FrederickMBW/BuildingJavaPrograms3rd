import java.util.*;

public class Rarest {
    public static int rarest(Map<String, Integer> map) {
        if (map.size() == 0) {
            throw new IllegalArgumentException();
        }

        // Create a map to count how many times an integer
        // appears as a value in the given map
        Map<Integer, Integer> count = new TreeMap<Integer, Integer>();

        for (int n : map.values()) {
            if (!count.containsKey(n)) {
                count.put(n, 1);
            } else {
                count.put(n, count.get(n) + 1);
            }
        }

        // Find the smallest number of times an integer appears
        // in the given map
        int min = Integer.MAX_VALUE;
        int number = 0;

        for (int n : count.keySet()) {
            if (count.get(n) < min) {
                min = count.get(n);
                number = n;
            }
        }

        return number;
    }
}
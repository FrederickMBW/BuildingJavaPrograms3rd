import java.util.*;

public class MaxOccurances {
    public static int maxOccurrences(List<Integer> list) {
        // Create a map to count the number of times each integer occurs in the list
        // Keep track of integer that appears the most times in the list
        Map<Integer, Integer> integerCount = new HashMap<Integer, Integer>();

        int maxCount = 0;

        for (Integer n : list) {
            if (integerCount.containsKey(n)) {
                integerCount.put(n, integerCount.get(n) + 1);
            } else {
                integerCount.put(n, 1);
            }
            maxCount = Math.max(integerCount.get(n), maxCount);
        }

        return maxCount;
    }
}
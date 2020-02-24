import java.util.*;

public class SwapPairs {
    public static void swapPairs(ArrayList<String> list) {
        for (int i = 1; i < list.size(); i += 2) {
            String temp = list.get(i);
            list.set(i, list.get(i - 1));
            list.set(i - 1, temp);
        }
    }
}
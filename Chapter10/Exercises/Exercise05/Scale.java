import java.util.*;

public class Scale {
    public static void scaleByX(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) <= 0) {
                list.remove(i);
            } else {
                for (int j = 1; j < list.get(i); j++) {
                    list.add(i, list.get(i));
                }
            }
        }
    }
}
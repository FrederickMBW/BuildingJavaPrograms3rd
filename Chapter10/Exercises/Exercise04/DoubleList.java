import java.util.*;

public class DoubleList {
    public static void doubleList(ArrayList<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            list.add(i, list.get(i));
        }
    }
}
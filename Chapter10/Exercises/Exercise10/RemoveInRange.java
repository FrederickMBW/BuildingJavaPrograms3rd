import java.util.*;

public class RemoveInRange {
    public static void removeInRange(ArrayList<String> list, String beginning, String ending) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(beginning) > 0 && list.get(i).compareTo(ending) < 0) {
                list.remove(i);
                i--;
            }
        }
    }
}
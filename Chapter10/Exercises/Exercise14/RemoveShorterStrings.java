import java.util.*;

public class RemoveShorterStrings {
    public static void removeShorterStrings(ArrayList<String> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1).length() <= list.get(i).length()) {
                list.remove(i - 1);
            } else {
                list.remove(i);
            }
        }
    }
}
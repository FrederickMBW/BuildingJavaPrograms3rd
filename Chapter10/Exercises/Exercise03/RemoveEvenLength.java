import java.util.*;

public class RemoveEvenLength {
    public static void removeEvenLength(ArrayList<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).length() % 2 == 0) {
                list.remove(i);
            }
        }
    }
}
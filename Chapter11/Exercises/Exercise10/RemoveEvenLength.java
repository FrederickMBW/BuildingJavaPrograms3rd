import java.util.*;

public class RemoveEvenLength {
    public static void removeEvenLength(Set<String> set) {
        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            String next = itr.next();

            if (next.length() % 2 == 0) {
                itr.remove();
            }
        }
    }
}

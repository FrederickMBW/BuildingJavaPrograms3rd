import java.util.*;

public class HasOdd {
    public static boolean hasOdd(Set<Integer> set) {
        for (int n : set) {
            if (n % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}
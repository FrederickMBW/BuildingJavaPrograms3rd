import java.util.*;

public class Clump {
    public static void clump(ArrayList<String> list) {
        for (int i = 1; i < list.size(); i++) {
            list.set(i - 1, "(" + list.get(i - 1) + " " + list.get(i) + ")");
            list.remove(i);
        }
    }
}
import java.util.*;

public class Reverse3 {
    public static void reverse3(ArrayList<Integer> list) {
        for (int i = 2; i < list.size(); i += 3) {
            swap(list, i, i - 2);
        }
    }

    public static void swap(ArrayList<Integer> list, int n1, int n2) {
        int temp = list.get(n1);
        list.set(n1, list.get(n2));
        list.set(n2, temp);
    }
}
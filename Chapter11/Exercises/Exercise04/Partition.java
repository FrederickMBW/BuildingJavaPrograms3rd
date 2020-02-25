import java.util.*;

public class Partition {
    public static void main(String[] args) {
        List<Integer> numbers1 = new LinkedList<Integer>();
        List<Integer> numbers2 = new ArrayList<Integer>();

        int value = Integer.parseInt(args[0]);

        for (int i = 1; i < args.length; i++) {
            numbers1.add(Integer.parseInt(args[i]));
            numbers2.add(Integer.parseInt(args[i]));
        }

        System.out.println("v: " + value);
        System.out.println("1: " + numbers1);
        System.out.println("2: " + numbers2);

        partition(numbers1, value);
        partition(numbers2, value);

        System.out.println("1: " + numbers1);
        System.out.println("2: " + numbers2);
    }

    public static void partition(List<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < value) {
                list.add(0, list.remove(i));
            }
        }
    }
}
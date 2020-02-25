import java.util.*;

public class SortAndRemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();

        for (int i = 0; i < args.length; i++) {
            list1.add(Integer.parseInt(args[i]));
            list2.add(Integer.parseInt(args[i]));
        }

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        System.out.println("Sort and Remove Duplicates");
        sortAndRemoveDuplicates(list1);
        sortAndRemoveDuplicates(list2);

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
    }

    public static void sortAndRemoveDuplicates(List<Integer> list) {
        Set<Integer> set = new TreeSet<Integer>(list);
        list.clear();
        list.addAll(set);
    }
}
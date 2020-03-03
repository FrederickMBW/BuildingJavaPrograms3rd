import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < args.length; i++) {
            list.add(args[i]);
        }

        subsets(list);
    }

    public static void subsets(List<String> list) {
        subsets(list, new ArrayList<String>(), 0);
    }

    private static void subsets(List<String> list, List<String> subset, int index) {
        // Stop if the index is greater than or equal to the size of the list 
        if (index >= list.size()) {
            return;
        }

        // Add the String at the given index in the list to the subset
        subset.add(list.get(index));

        // Find all the subsets that contain the String
        subsets(list, subset, index + 1);

        // Print the list with the String
        System.out.println(subset);

        // Remove the String from the list
        subset.remove(subset.size() - 1);

        // Print it all the combos without the String
        subsets(list, subset, index + 1);

        // Print the empty sublist
        if (subset.size() == 0 && index == 0) {
            System.out.println(subset);
        }
    }
}
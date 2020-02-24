import java.util.*;

public class Alternate {
    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
        // Create a new list to store the result
        List<Integer> result = new ArrayList<Integer>();

        // Add the ints from list1 and list2 to the result alternatively
        Iterator<Integer> itr1 = list1.iterator();
        Iterator<Integer> itr2 = list2.iterator();

        while (itr1.hasNext() && itr2.hasNext()) {
            result.add(itr1.next());
            result.add(itr2.next());
        }

        // Add the remaining integers
        while(itr1.hasNext()) {
            result.add(itr1.next());
        }

        while(itr2.hasNext()) {
            result.add(itr2.next());
        }

        return result;
    }
}
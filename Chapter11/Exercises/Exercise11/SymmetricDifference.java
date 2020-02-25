import java.util.*;

public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        for (int i = 0; i < args.length / 2; i++) {
            set1.add(Integer.parseInt(args[i]));
        }

        for (int i = args.length / 2; i < args.length; i++) {
            set2.add(Integer.parseInt(args[i]));
        }

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        System.out.println("Symmetric Difference");
        Set<Integer> diff = symmetricDifference(set1, set2);

        System.out.println("Difference: " + diff);
    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        // Create a result to return
        Set<Integer> result = new HashSet<Integer>();

        // Add all the elements in set1 and not in set2 to the result
        for (int n : set1) {
            if (!set2.contains(n)) {
                result.add(n);
            }
        }   

        // Add all the elements in set2 and not in set1 to the result
        for (int n : set2) {
            if (!set1.contains(n)) {
                result.add(n);
            }
        }

        // Return the symmetric difference
        return result;
    }
}
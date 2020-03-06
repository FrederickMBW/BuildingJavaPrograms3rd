import java.util.*;

public class Bogo {
    public static void main(String[] args) {
        int[] a = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
        }

        System.out.println(Arrays.toString(a));

        bogo(a);

        System.out.println(Arrays.toString(a));
    }

    public static void bogo(int[] a) {
        while (!isSorted(a)) {
            Shuffle.shuffle(a);
            System.out.println(Arrays.toString(a));
        }
    }

    // Returns true if an array of integers is sorted
    public static boolean isSorted(int[] a) {
        if (a == null || a.length <= 1) {
            return true;
        }

        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                return false;
            }
        }

        return true;
    }
}
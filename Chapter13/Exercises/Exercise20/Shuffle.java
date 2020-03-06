import java.util.*;

public class Shuffle {
    public static void main(String[] args) {
        int[] a = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
        }

        System.out.println(Arrays.toString(a));

        shuffle(a);

        System.out.println(Arrays.toString(a));
    }

    public static void shuffle(int[] a) {
        Random rand = new Random();

        for (int i = 0; i < a.length - 1; i++) {
            int next = rand.nextInt(a.length - i - 1) + i + 1;
            swap(a, i, next);
        }
    }

    public static void swap(int[] a, int n1, int n2) {
        if (n1 == n2) {
            return;
        }

        int temp = a[n1];
        a[n1] = a[n2];
        a[n2] = temp;
    }
}
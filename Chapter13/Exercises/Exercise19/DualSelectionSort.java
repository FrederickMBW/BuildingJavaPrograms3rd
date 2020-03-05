import java.util.*;

public class DualSelectionSort {
    public static void main(String[] args) {
        int[] a = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
        }

        System.out.println(Arrays.toString(a));

        dualSelectionSort(a);

        System.out.println(Arrays.toString(a));
    }

    public static void dualSelectionSort(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int min = i;
            
            for (int j = i + 1; j < a.length - i; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            swap(a, i, min);
            int max = i;

            for (int j = i + 1; j < a.length - i; j++) {
                if (a[j] > a[max]) {
                    max = j;
                }
            }

            swap(a, a.length - i - 1, max);
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
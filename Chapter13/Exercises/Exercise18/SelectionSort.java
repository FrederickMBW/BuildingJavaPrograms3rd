import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        System.out.println(Arrays.toString(array));

        selectionSort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] a) {
        for (int i = a.length - 1; i >= 1; i--) {
            int max = i;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[max]) {
                    max = j;
                }
            }
            swap(a, max, i);
        }
    }

    public static void swap(int[] a, int n1, int n2) {
        int temp = a[n1];
        a[n1] = a[n2];
        a[n2] = temp;
    }
}
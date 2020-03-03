import java.util.*;

public class MaxSum {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i < args.length; i++) {
            list.add(Integer.parseInt(args[i]));
        }

        System.out.println(maxSum(list, n));
    }

    public static int maxSum(List<Integer> list, int n) {
        return maxSum(list, n, 0, 0);
    }

    private static int maxSum(List<Integer> list, int n, int index, int sum) {
        if (index >= list.size()) {
            if (sum <= n) {
                return sum;
            } else {
                return 0;
            }
        }

        return Math.max(maxSum(list, n, index + 1, sum), maxSum(list, n, index + 1, sum + list.get(index)));
    }
}
import java.lang.Math;

public class LargestAbsVal {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i += 3) {
            largerAbsVal(Integer.parseInt(args[i]), Integer.parseInt(args[i + 1]), Integer.parseInt(args[i + 2]));
        }
    }

    public static int largerAbsVal(int n1, int n2, int n3) {
        int max = Math.max(Math.max(Math.abs(n1), Math.abs(n2)), Math.abs(n3));
        System.out.print(max);
        return max;
    }
}
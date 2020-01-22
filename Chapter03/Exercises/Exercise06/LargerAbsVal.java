import java.lang.Math;

public class LargerAbsVal {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i += 2) {
            largerAbsVal(Integer.parseInt(args[i]), Integer.parseInt(args[i + 1]));
        }
    }

    public static int largerAbsVal(int n1, int n2) {
        int max = Math.max(Math.abs(n1), Math.abs(n2));
        System.out.print(max);
        return max;
    }
}
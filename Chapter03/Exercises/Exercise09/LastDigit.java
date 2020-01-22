import java.lang.Math;

public class LastDigit {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(lastDigit(Integer.parseInt(args[i])));
        }
    }

    public static int lastDigit(int n) {
        return Math.abs(n % 10);
    }
}
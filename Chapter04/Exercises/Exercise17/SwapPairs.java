import java.lang.*;

public class SwapPairs {
    public static void main(String[] args) {
        String s = args[0];

        System.out.print(swapPairs(s));
    }

    public static String swapPairs(String s) {
        StringBuffer result = new StringBuffer();

        for (int i = 1; i < s.length(); i += 2) {
            result.append(s.charAt(i));
            result.append(s.charAt(i - 1));
        }

        if (s.length() % 2 != 0) {
            result.append(s.charAt(s.length() - 1));
        }

        return result.toString();
    }
}
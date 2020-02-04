public class AllDigitsOdd {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        System.out.println(allDigitsOdd(n));
    }

    // Returns true if all digits are odd in an integer
    public static boolean allDigitsOdd(int n) {
        while (n != 0) {
            if (n % 2 == 0) {
                return false;
            }
            n /= 10;
        }

        return true;
    }
}
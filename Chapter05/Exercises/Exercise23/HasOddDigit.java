public class HasOddDigit {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        System.out.println(hasOddDigit(n));
    }

    // Returns true if the integer has an odd digit
    // Returns false otherwise
    public static boolean hasOddDigit(int n) {

        while (n != 0) {
            if (n % 2 != 0) {
                return true;
            }
            n /= 10;
        }

        return false;
    }
}
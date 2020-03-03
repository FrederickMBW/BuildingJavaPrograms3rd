public class IsRevers {
    public static void main(String[] args) {
        String s1 = args[0];
        String s2 = args[1];

        System.out.println(isReverse(s1, s2));
    }

    public static boolean isReverse(String s1, String s2) {
        // Null can't be reversed
        if (s1 == null || s2 == null) {
            throw new NullPointerException();
        }

        // If the lengths are not the same, they are not reversed
        if (s1.length() != s2.length()) {
            return false;
        }

        // If the length is down to zero
        // You have found two words that are reverse of eachother
        if (s1.length() == 0) {
            return true;
        }

        // Get the first character of String one and the last character of String 2
        char s1Front = Character.toUpperCase(s1.charAt(0));
        char s2Back = Character.toUpperCase(s2.charAt(s2.length() - 1));

        // Return True if the first and last characters are equal and the rest of the word is reversed
        return s1Front == s2Back && isReverse(s1.substring(1), s2.substring(0, s2.length() - 1));
    }
}
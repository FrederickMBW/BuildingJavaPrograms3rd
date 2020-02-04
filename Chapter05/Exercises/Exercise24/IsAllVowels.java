public class IsAllVowels {
    public static void main(String[] args) {
        String s = args[0];

        System.out.println(isAllVowels(s));
    }

    // Returns true if all characters in a string are a vowel
    // Returns false otherwise
    public static boolean isAllVowels(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toUpperCase(s.charAt(i));
            if (c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                return false;
            }
        }
        return true;
    }
}
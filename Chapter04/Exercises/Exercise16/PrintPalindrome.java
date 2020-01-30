public class PrintPalindrome {
    public static void main(String[] args) {
        String s = args[0];

        printPalindrome(s);
    }

    // Prints if a string is a palindrome
    public static void printPalindrome(String s) {
        // Create a boolean to keep track if the String is a palindrome
        boolean isPalindrome = true;

        for (int i = 0; i < s.length() / 2; i++) {
            // Get the two matching characters
            char c1 = Character.toUpperCase(s.charAt(i));
            char c2 = Character.toUpperCase(s.charAt(s.length() - i -1));

            // Check if the two characters are the same characters
            // If they are not equal, set isPalindrome to false and break from the loop
            if (c1 != c2) {
                isPalindrome = false;
                break;
            }
        }

        // Print the results to the terminal
        if (isPalindrome) {
            System.out.print(s + " is a Palindrom");
        } else {
            System.out.print(s + " is NOT a Palindrom");
        }
    }
}
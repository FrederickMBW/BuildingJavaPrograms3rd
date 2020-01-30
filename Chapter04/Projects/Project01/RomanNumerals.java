public class RomanNumerals {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        System.out.print(integerToRomanNumeral(n));
    }

    // Converts an integer to a roman numeral between 0 and 1000
    // I have seen solutions to this that a super elegant, this won't be
    public static String integerToRomanNumeral(int n) {

        if (n < 0 || n > 100) {
            throw new IllegalArgumentException();
        }

        // Create a String to contain the roman numeral
        String romanNumeral = "";

        //Add the end of the roman numeral to the number
        int mod1 = n % 5;
        int mod2 = n % 10;

        if (mod2 <= 5) {

        } else {

        }

        if (mod1 == 1) {
            romanNumeral += "I";
        } else if (mod1 == 2) {
            romanNumeral += "II";
        } else if (mod1 == 3) {
            romanNumeral += "III";
        } else if (mod1 == 4) {
            romanNumeral += "I";
        }
    }
}
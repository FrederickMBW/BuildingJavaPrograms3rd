public class RomanNumerals {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            System.out.printf("%5d%15s\n", i, integerToRomanNumeral(i));
        }
    }

    // Converts an integer to a roman numeral between 0 and 999
    // I have seen solutions to this that a super elegant, this won't be
    public static String integerToRomanNumeral(int n) {
        if (n < 1 || n >= 1000) {
            throw new IllegalArgumentException();
        }

        // Create a String to contain the roman numeral
        String romanNumeral = "";

        // Add the ones digit to the roman numeral
        romanNumeral += romanConversion('I', 'V', 'X', n % 10);

        // Add the tens digit to the roman numeral
        n /= 10; // Remove the ones digit from the integer
        romanNumeral = romanConversion('X', 'L', 'C', n % 10) + romanNumeral;

        // Add the hundreds digit to the roman numeral
        n /= 10; // Remove the tens digit from the integer
        romanNumeral = romanConversion('C', 'D', 'M', n % 10) + romanNumeral;

        // Return the result
        return romanNumeral;
    }

    // Converts a integer between 1 and 9 into a roman numeral
    // Must be given the three characters that can be used for that integer
    public static String romanConversion(char c1, char c2, char c3, int n) {
        // Throw exception if not an integer between 0 and 9 inclusive
        if (n < 0 || n > 9) {
            throw new IllegalArgumentException();
        }

        // Return blank String if n is zero
        if (n == 0) {
            return "";
        }
        
        // Calculate modulus 5 of n and store as a variable
        int mod5 = n % 5;

        // Determine and return the correct roman numeral
        if (n <= 5) {
            if (mod5 == 1) {
                return "" + c1;
            } else if (mod5 == 2) {
                return "" + c1 + c1;
            } else if (mod5 == 3) {
                return "" + c1 + c1 + c1;
            } else if (mod5 == 4) {
                return "" + c1 + c2;
            } else { // mod5 == 0
                return "" + c2;
            }
        } else {
            if (mod5 == 1) {
                return "" + c2 + c1;
            } else if (mod5 == 2) {
                return "" + c2 + c1 + c1;
            } else if (mod5 == 3) {
                return "" + c2 + c1 + c1 + c1;
            } else {
                return "" + c1 + c3;
            } 
        }
    }
}
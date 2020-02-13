// Class to contain integers up to 50 characters long
public class LargeInteger {
    private static int LENGTH = 50;
    private int[] value;

    // Constructers
    public LargeInteger() {
        this.value = new int[LENGTH];
    }

    public LargeInteger(int[] value) {
        // Throw exceptions if given illegal arguments
        if (value == null) {
            throw new NullPointerException();
        }

        if (value.length != 50) {
            throw new IllegalArgumentException();
        }

        this.value = value;
    }

    public LargeInteger(int value) {
        if (value < 0) {
            throw new IllegalArgumentException();
        }

        this.value = new int[LENGTH];

        int pos = LENGTH - 1;
        while (value > 0) {
            this.value[pos] = value % 10;
            value /= 10;
            pos--;
        }
    }

    public LargeInteger(String number) {
        // Throw exceptions if given illegal arguments
        if (number == null) {
            throw new NullPointerException();
        }

        if (number.length() > LENGTH) {
            throw new IllegalArgumentException();
        }

        if (!isAllNumbers(number)) {
            throw new IllegalArgumentException();
        }

        // Create the integer
        this.value = new int[50];
        for (int i = 0; i < number.length(); i++) {
            this.value[value.length - 1 - i] = Character.getNumericValue(number.charAt(number.length() - i - 1));
        }
    }

    // Returns true if a String only contains digits
    // Returns false otherwise
    private static boolean isAllNumbers(String value) {
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isDigit(value.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // Add two LargeIntegers together
    public static LargeInteger add(LargeInteger l1, LargeInteger l2) {
        int[] added = new int[LENGTH];
        for (int i = LENGTH - 1; i >= 0; i--) {
            int next = added[i] + l1.value[i] + l2.value[i];

            if (next < 10) {
                added[i] = next;
            } else if (i > 0) {
                added[i] = next % 10;
                added[i - 1] = 1;
            } else {
                added[i] = next % 10;
            }
        }
        return new LargeInteger(added);
    }

    // Returns a String representation of the large integer
    public String toString() {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < this.value.length; i++) {
            result.append(this.value[i]);
        }

        return result.toString();
    }

}
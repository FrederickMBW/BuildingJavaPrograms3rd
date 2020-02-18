public class RationalNumber {
    private int numerator;
    private int denominator;

    // Default constructor for Rational Number
    public RationalNumber() {
        this(0, 1);
    }

    // Constructor when given numerator and denominator
    // post: denominator is never negative
    public RationalNumber(int numerator, int denominator) {
        // Can't have a denominator of zero
        if (denominator == 0) {
            throw new IllegalArgumentException();
        }

        // Only the numerator can be negative
        if (numerator < 0 && denominator < 0 || numerator > 0 && denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }

        // Reduce the numerator and the denominator
        reduce(numerator, denominator);
    }

    // Reduce the numerator and denomerator
    private void reduce(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);

        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    // Getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Returns a string representation of the rational number
    public String toString() {

        if (this.denominator == 1) {
            return "" + numerator;
        } else {
            return String.format("(%d/%d)", numerator, denominator);
        }
    }

    // Returns the greatest common divisor of two integers
    // Uses Euclid's algorthm
    private static int gcd(int n1, int n2) {
        // Make the numbers positive
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);

        // Make n1 the larger of the two integers
        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        // Use Euclid's algorithm to find the gcd
        while (n1 % n2 != 0) {
            int temp = n1 % n2;
            n1 = n2;
            n2 = temp;
        }

        return n2;
    }
}
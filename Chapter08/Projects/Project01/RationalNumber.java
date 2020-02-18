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

    // Returns the least common multiple
    private static int lcm(int n1, int n2) {
        int gcd = gcd(n1, n2);
        int product = n1 * n2;

        return product / gcd;
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

    // Multiplies two rational numbers and returns a new rational number
    public static RationalNumber multiply(RationalNumber r1, RationalNumber r2) {
        int num = r1.numerator * r2.numerator;
        int den = r1.denominator * r2.denominator;

        return new RationalNumber(num, den);
    }

    // Multiplies this rational number by another rational number
    // Returns the result of the multiplication as a new RationalNumber
    public RationalNumber multiply(RationalNumber other) {
        return multiply(this, other);
    }

    // Divides two rational numbers and returns a new rational number
    public static RationalNumber divide(RationalNumber r1, RationalNumber r2) {
        int num = r1.numerator * r2.denominator;
        int den = r1.denominator * r2.numerator;

        return new RationalNumber(num, den);
    }

    // Divides this rational number by another rational number
    // Returns the result of the division as a new RationalNumber
    public RationalNumber divide(RationalNumber other) {
        return divide(this, other);
    }

    // Add two rational numbers together
    public static RationalNumber add(RationalNumber n1, RationalNumber n2) {
        int commonDenominator = lcm(n1.denominator, n2.denominator);

        int num1 = n1.numerator * commonDenominator / n1.denominator;
        int num2 = n2.numerator * commonDenominator / n2.denominator;

        int numerator = num1 + num2;

        return new RationalNumber(numerator, commonDenominator);
    }

    // Add a rational number to this rational number
    public RationalNumber add(RationalNumber other) {
        return add(this, other);
    }
}
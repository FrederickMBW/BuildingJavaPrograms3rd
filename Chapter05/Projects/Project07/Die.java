import java.util.*;

// This class represents a 6 sided die
public class Die {
    private static final int SIZE = 6;
    private static Random rand = new Random();
    private int value;

    // Constructor
    public Die() {
        this.roll();
    }

    // Roll the die
    public void roll() {
        this.value = rand.nextInt(SIZE) + 1;
    }

    // Returns the current value of the die
    public int getValue() {
        return this.value;
    }

    // Set the value of the die
    public void setValue(int value) {
        if (value < 1 || value > SIZE) {
            throw new IllegalArgumentException();
        }

        this.value = value;
    }

    // Return the string representation of the die
    public String toString() {
        String string = "*-------*\n";

        if (this.value == 1) {
            string += "|       |\n";
            string += "|   *   |\n";
            string += "|       |\n";
        } else if (this.value == 2) {
            string += "| *     |\n";
            string += "|       |\n";
            string += "|     * |\n";
        } else if (this.value == 3) {
            string += "| *     |\n";
            string += "|   *   |\n";
            string += "|     * |\n";
        } else if (this.value == 4) {
            string += "| *   * |\n";
            string += "|       |\n";
            string += "| *   * |\n";
        } else if (this.value == 5) {
            string += "| *   * |\n";
            string += "|   *   |\n";
            string += "| *   * |\n";
        } else { // this.value == 6
            string += "| *   * |\n";
            string += "| *   * |\n";
            string += "| *   * |\n";
        }

        string += "*-------*\n";

        return string;
    }

    // Equals
    public boolean equals(Object o) {
        if (o instanceof Die) {
            Die other = (Die) o;
            return this.value == other.value;
        }
        return false;
    }
}
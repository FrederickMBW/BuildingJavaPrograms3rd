import java.util.Random;

public class RandomIncrementer implements Incrementable {
    private static final Random RANDOM_NUMBER_GENERATOR = new Random();

    private int value;

    // Constructor
    public RandomIncrementer() {
        this.value = 0;
    }

    // Increments the value by one
    public void increment() {
        this.value = RANDOM_NUMBER_GENERATOR.nextInt();
    }

    // Returns the value
    public int getValue() {
        return this.value;
    }
}
public class SequentialIncrementer implements Incrementable {
    private int value;

    // Constructor
    public SequentialIncrementer() {
        this.value = 0;
    }

    // Increments the value by one
    public void increment() {
        value++;
    }

    // Returns the value
    public int getValue() {
        return this.value;
    }
}
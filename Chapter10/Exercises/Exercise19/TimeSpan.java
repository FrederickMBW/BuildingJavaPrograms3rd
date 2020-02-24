public class TimeSpan {
    private static final int MINUTES_PER_HOUR = 60;
    private int totalMinutes;

    // Construct a time spac with the give interval
    public TimeSpan(int hours, int minutes) {
        totalMinutes = 0;
        add(hours, minutes);
    }

    // Adds the given interval to this time span
    // pre: hours > 0 && minutes > 0
    public void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0) {
            throw new IllegalArgumentException();
        }
        totalMinutes += MINUTES_PER_HOUR * hours + minutes;
    }

    // Add the other timespan to this time span
    public void add(TimeSpan other) {
        add(0, other.totalMinutes);
    }

    // Subtracts the other timespace from this timespace
    public void subtract(TimeSpan other) {
        if (other.totalMinutes > this.totalMinutes) {
            throw new IllegalArgumentException();
        }

        this.totalMinutes -= other.totalMinutes;
    }

    // Scales the timespace
    public void scale(int factor) {
        if (factor < 0) {
            throw new IllegalArgumentException();
        }

        totalMinutes *= factor;
    }

    // returns a String for this time span
    public String toString() {
        return (totalMinutes / MINUTES_PER_HOUR) + "h " + (totalMinutes % MINUTES_PER_HOUR) + "m";
    }
}
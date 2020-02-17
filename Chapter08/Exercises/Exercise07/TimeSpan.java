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

    // returns a String for this time span
    public String toString() {
        return (totalMinutes / MINUTES_PER_HOUR) + "h " + (totalMinutes & MINUTES_PER_HOUR) + "m";
    }
}
import java.util.*;

public class Birthday {

    public static final int DAYS_IN_YEAR = 365;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Get the first users birthday
        System.out.print("Person1: ");
        int p1Month = console.nextInt();
        int p1Day = console.nextInt();

        // Get the second users birthday
        System.out.print("Person2: ");
        int p2Month = console.nextInt();
        int p2Day = console.nextInt();

        // Get todays date
        System.out.print("Today: ");
        int month = console.nextInt();
        int day = console.nextInt();

        // Get the absolute date for the given dates
        int p1AbsoluteDate = getAbsoluteDate(p1Month, p1Day);
        int p2AbsoluteDate = getAbsoluteDate(p2Month, p2Day);
        int absoluteDate = getAbsoluteDate(month, day);

        // Calculate the days until their respective birthdays
        int p1DaysToBirthday = getDaysToBirthday(absoluteDate, p1AbsoluteDate);
        int p2DaysToBirthday = getDaysToBirthday(absoluteDate, p2AbsoluteDate);

        // Print the days until each persons birthday
        System.out.println("Days until person 1's birthday: " + p1DaysToBirthday);
        System.out.println("Days until person 2's birthday: " + p2DaysToBirthday);

        // Determine who's birthday is sooner and print it
        if (p1DaysToBirthday == p2DaysToBirthday) {
            System.out.println("Their birthdays are the same!");
        } else if (p1DaysToBirthday < p2DaysToBirthday) {
            System.out.println("Person 1's birthday is sooner!");
        } else {
            System.out.println("Person 2's birthday is sooner!");
        }

    }

    // Get the number of days until the birthday
    public static int getDaysToBirthday(int absoluteDay, int birthdayAbsoluteDay) {
        if (birthdayAbsoluteDay >= absoluteDay) {
            return birthdayAbsoluteDay - absoluteDay;
        } else {
            return DAYS_IN_YEAR - absoluteDay + birthdayAbsoluteDay;
        }
    }

    // Returns the absolute date for someones birthday
    // Assumes it is not a leap year
    public static int getAbsoluteDate(int month, int day) {
        // Create a counter to keep track of the absolute date
        int counter = 0;

        // Add the days in every month before the birthday month to the counter
        for (int i = 1; i <= month; i++) {
            counter += daysInMonth(i);
        }

        // Add the days in the month to the counter
        counter += day;

        // Return the result
        return counter;
    }

    // Returns the number of days in a month (when not a leap year)
    public static int daysInMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Not a valid month");
        }

        if (month == 2) {
            return 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }
}
public class Date {
    private static final int MONTHS_PER_YEAR = 12;
    private static final int DAYS_PER_WEEK = 7;

    // The number of days since 0/0/0
    public int days = 0;

    // Default constructor
    Date() {
        int days = 0;
    }

    // Create a date when given the year, month, and day
    Date(int year, int month, int day) {
        if (year < 0 || month < 0 || day < 0) {
            throw new IllegalArgumentException();
        }

        addYears(year);
        addMonths(year, month);
        addDays(day);
    }

    // Adds the year to the total number of days
    private void addYears(int year) {
        for (int i = 0; i < year; i++) {
            if (isLeapYear(i)) {
                days += 366;
            } else {
                days += 365;
            }
        }
    }

    // Returns true if a year is a leap year
    private static boolean isLeapYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException();
        }

       if (!(year % 4 == 0)) {
           return false;
       } else if (!(year % 100 == 0)) {
           return true;
       } else if (!(year % 400 == 0)) {
           return false;
       } else {
           return true;
       }
    }

    // Add the months to the total number of days
    private void addMonths(int year, int month) {
        if (month < 1 || month > MONTHS_PER_YEAR) {
            throw new IllegalArgumentException();
        }

        // Add the days for all the months before the current month
        for (int i = 1; i < month; i++) {
            days += daysInMonth(i);
        }

        // Add an additional day if month is after feburary in a leap year
        if (isLeapYear(year) && month > 2) {
            days++;
        }
    }

    // Returns the number of days in a month
    private int daysInMonth(int month) {
        if (month < 1 || month > MONTHS_PER_YEAR) {
            throw new IllegalArgumentException();
        }

        if (month == 1) {
            return 28;
        } else if (month == 11 || month == 9 || month == 6 || month == 4) {
            return 30;
        } else {
            return 31;
        }
    }

    // Add days to the date
    public void addDays(int days) {
        this.days += days;
    }

    // Add weeks to the date
    public void addWeeks(int weeks) {
        this.days += weeks * DAYS_PER_WEEK;
    }

    // Returns the number of days that this Date must be adjusted to make equal to another date
    public int daysTo(Date d) {
        return d.days - this.days;
    }
}
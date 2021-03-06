public class Date {
    private static final int DAYS_PER_YEAR = 365;
    private static final int DAYS_PER_LEARYEAR = 366;
    private static final int MONTHS_PER_YEAR = 12;
    private static final int DAYS_PER_WEEK = 7;

    // The number of days since 0/0/0
    private int days;

    // Default constructor
    Date() {
        days = 0;
    }

    // Create a date when given the year, month, and day
    Date(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException();
        }

        days = 0;
        addYears(year);
        addMonths(year, month);
        addDays(day);
    }

    // Returns true if the given date is valid
    // Returns false otherwise
    private boolean isValidDate(int year, int month, int day) {
        // Check the year
        if (year < 0) {
            return false;
        }

        // Check the month
        if (month < 1 || month > MONTHS_PER_YEAR) {
            return false;
        }

        // Check the day
        if (day < 1) {
            return false;
        }

        if (isLeapYear(year) && month == 2) {
            return day <= daysInMonth(month) + 1;
        } else if (day > daysInMonth(month)) {
            return false;
        }

        // Congratulations, it is a valid date!
        return true;
    }

    
    // Adds the year to the total number of days
    private void addYears(int year) {
        for (int i = 0; i < year; i++) {
            if (isLeapYear(i)) {
                days += DAYS_PER_LEARYEAR;
            } else {
                days += DAYS_PER_YEAR;
            }
        }
    }

    // Returns true if this date is in a leap year
    public boolean isLeapYear() {
        return isLeapYear(this.getYear());
    }

    // Returns true if a year is a leap year
    private static boolean isLeapYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException();
        }

       if (year % 4 != 0) {
           return false;
       } else if (year % 100 != 0) {
           return true;
       } else if (year % 400 != 0) {
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

        if (month == 2) {
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

    // Returns the day of the month for the date
    public int getDay() {
        return getYearMonthDay()[2];
    }

    // Returns the month for the date
    public int getMonth() {
        return getYearMonthDay()[1];
    }

    // Returns the year for the date
    public int getYear() {
        return getYearMonthDay()[0];
    }

    // Returns an array with the with the year, month, and day
    private int[] getYearMonthDay() {
        int daysLeft = days;
        int year = 0;
        int month = 1;
        int day = 0;

        // Find the year
        while (isLeapYear(year) && daysLeft > DAYS_PER_LEARYEAR || !isLeapYear(year) && daysLeft > DAYS_PER_YEAR) {
            year++;

            daysLeft -= 365;

            if (isLeapYear(year)) {
                daysLeft--;
            }
        }

        // Find the month
        for (int i = 1; i < MONTHS_PER_YEAR; i++) {
            if (isLeapYear(year) && month == 2) {
                if (daysLeft > daysInMonth(month) + 1) {
                    daysLeft -= (daysInMonth(month) + 1);
                } else {
                    break;
                }
            } else if (daysLeft > daysInMonth(month)) {
                daysLeft -= daysInMonth(month);
            } else {
                break;
            }

            month++;
        }

        // Find the day
        day = daysLeft;

        return new int[]{year, month, day};
    }

    // Returns a string representation of the object
    public String toString() {
        return String.format("%d/%d/%d", getYear(), getMonth(), getDay());
    }

}
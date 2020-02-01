// Calculates the day of the week when give the year month and day
// Only works for dates after january 1st, 1601

import java.util.*;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Get the year
        System.out.print("Year? ");
        int year = console.nextInt();

        // Get the month
        System.out.print("Month? ");
        int month = console.nextInt();

        // Get the day
        System.out.print("Day? ");
        int day = console.nextInt();

        // Get the number of days since January 1st, 1601
        int daysSince = daySinceJan1601(year, month, day);

        // Get the day of the week
        String dayOfWeek = getDayOfWeek(daysSince);

        // Print the day of the week
        System.out.println(dayOfWeek);
    }

    // Returns the numbers of days since January 1st, 1601
    public static int daySinceJan1601(int year, int month, int day) {
        if (year < 1601) {
            throw new IllegalArgumentException();
        }

        // Keep track of the number of days
        int daysSince = 0;

        // Add the number of days in each year
        for (int i = 1601; i < year; i++) {
            if (isLeapYear(i)) {
                daysSince += 366;
            } else {
                daysSince += 365;
            }
        }

        // Add the number of days for each month
        for (int i = 1; i < month; i++) {
            daysSince += daysInMonth(month);
        }

        // Add the day
        daysSince += day;

        // Add an additional day if in a leap year and after febuary
        if (isLeapYear(year) && month > 2) {
            daysSince++;
        }

        // Return the result
        return daysSince;
    }

    // Returns if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }

        return false;
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

    // Returns the day of the week when given the number of days since Jan 1st,
    public static String getDayOfWeek(int daysSince) {
        int n = daysSince % 7;

        if (n == 1) {
            return "Monday";
        } else if (n == 2) {
            return "Tuesday";
        } else if (n == 3) {
            return "Wednesday";
        } else if (n == 4) {
            return "Thursday";
        } else if (n == 5) {
            return "Friday";
        } else if (n == 6) {
            return "Saturday";
        } else { // n == 7
            return "Sunday";
        }
    }
}
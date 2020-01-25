// Example: "Java Calendar 4 31"
// First argument is the date of the first Sunday of the month (1 - 7)
// Second argument is the number of days in the month

public class Calendar {
    public static final int DAYS_IN_A_WEEK = 7;
    public static void main(String[] args) {
        // Get the first sunday and total number of days from the command line
        int firstSunday = Integer.parseInt(args[0]);
        int numberOfDays = Integer.parseInt(args[1]);

        // Print the calendar
        printCalendar(firstSunday, numberOfDays);
    }

    public static void printCalendar(int firstSunday, int numberOfDays) {
        // Print the days of the week
        printNamesOfDays();

        // Print the top bar
        printBar();

        // Print the core of the calendar
        printCalendarCore(firstSunday, numberOfDays);

        // Print the bottom bar
        printBar();
    }

    public static void printNamesOfDays() {
        System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
    }

    public static void printBar() {
        System.out.print("+");
        for (int i = 0; i < 7; i++) {
            System.out.print("------+");
        }
        System.out.println();
    }

    public static void printCalendarCore(int firstSunday, int numberOfDays) {
        // Do some calculations
        int daysInFirstWeek = DAYS_IN_A_WEEK - (8 - firstSunday) % DAYS_IN_A_WEEK;
        int numberOfMiddleRows = (numberOfDays - daysInFirstWeek) / DAYS_IN_A_WEEK;

        // Draw the first row
        drawFirstRow(firstSunday, daysInFirstWeek);

        // Calculate the the next date to print in the next row
        int nextDate = daysInFirstWeek + 1;

        // Draw the middle rows
        drawMiddleRows(numberOfMiddleRows, nextDate);
        
        //Draw the last row
        nextDate += numberOfMiddleRows * DAYS_IN_A_WEEK;
        printLastRow(numberOfDays, nextDate);
    }

    // Draws the first row in for a calendar month. Assumes there are greater than 7 days in the month
    public static void drawFirstRow(int firstSunday, int daysInFirstWeek) {
        // Draw the left line of the calender
        System.out.print("|");

        // Calculate the number of blank days
        int blankDays = DAYS_IN_A_WEEK - daysInFirstWeek;
        
        // Print the blank days
        for (int i = 0; i < blankDays; i++) {
            System.out.print("      |");
        };

        // Print the remaining days
        for (int i = 1; i <= daysInFirstWeek; i++) {
            System.out.print(padded(i, 4) + "  |");
        }

        // Go to the next line
        System.out.println();
    }

    public static void drawMiddleRows(int numberOfMiddleRows, int nextDate) {
        // Draw every row
        for (int i = 0; i < numberOfMiddleRows; i++) {

            // Print the left | in the row
            System.out.print("|");

            // Print every date for the row
            for (int j = 0; j < DAYS_IN_A_WEEK; j++) {
                System.out.print(padded(nextDate, 4) + "  |");
                nextDate++;
            }
            System.out.println();
        }
    }

    public static void printLastRow(int numberOfDays, int nextDate) {
        // Calculate days left to print
        int daysLeft = numberOfDays - nextDate + 1;

        // This convoluted loop is used as an conditional because they haven't been introduced yet
        // Part of the challenge was making it work using the tool availiable up to this point in the textbook
        for (int j = 0; j < DAYS_IN_A_WEEK - (DAYS_IN_A_WEEK - daysLeft); j++) {
            // Print the left | for the row
            System.out.print("|");

            // Print the days in the row
            for (int i = 0; i < daysLeft; i++) {
                System.out.print(padded(nextDate, 4) + "  |");
                nextDate++;
            }

            // Print the blanks at the end
            for (int i = 0; i < DAYS_IN_A_WEEK - daysLeft; i++) {
                System.out.print("      |");
            }

            // Go to the next line
            System.out.println();
            return;
        }
    }

    public static String padded(int n, int width) {
        String s = "" + n;
        for (int i = s.length(); i < width; i++) {
            s = " " + s;
        }
        return s;
    }
}
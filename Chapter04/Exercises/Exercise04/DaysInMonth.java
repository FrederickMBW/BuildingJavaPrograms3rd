public class DaysInMonth {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.println("Month: " + i + " Days " + daysInMonth(i));
        }
    }

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
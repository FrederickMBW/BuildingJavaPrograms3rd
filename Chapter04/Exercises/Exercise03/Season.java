public class Season {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) { // Months
            for (int j = 1; j <= 31; j++) { // Days
                System.out.println("Month: " + i + " Day: " + j + " Season: " + season(i, j));
            }
        }
    }

    public static String season(int month, int day) {
        if (month < 0 || month > 12) {
            throw new IllegalArgumentException("Not a valid month");
        }

        if (day < 0 || day > 31) {
            throw new IllegalArgumentException("Not a valid day");
        }

        if (month == 3 && day >= 16 || month == 4 || month == 5 || month == 6 && day <= 15) {
            return "Spring";
        } else if (month == 6 || month == 7 || month == 8 || month == 9 && day <= 15) {
            return "Summer";
        } else if (month == 9 || month == 10 || month == 11 || month == 12 && day <= 15) {
            return "Fall";
        } else {
            return "Winter";
        }
    }
}
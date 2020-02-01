import java.util.*;

public class CheckDigit {
    public static void main(String[] args) {
        // Get student number
        String studentNumber = getStudentNumber();

        // Calculate Check digit
        int checkDigit = getCheckDigit(studentNumber);

        // Print the results
        System.out.println(checkDigit);
    }

    // Return the students number
    public static String getStudentNumber() {
        Scanner console = new Scanner(System.in);

        System.out.print("Student Number: ");

        String number = console.next();

        console.close();

        return number;
    }

    // Returns the check digit of a 6 digit student number
    public static int getCheckDigit(String number) {
        if (number.length() != 6) {
            throw new IllegalArgumentException();
        }

        int checkDigit = 0;

        for (int i = 0; i < number.length(); i++) {
            checkDigit += (i + 1) * Character.getNumericValue(number.charAt(i));
        }

        return checkDigit % 10;
    }
}
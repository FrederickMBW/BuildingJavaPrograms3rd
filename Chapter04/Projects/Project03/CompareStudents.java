import java.util.*;

public class CompareStudents {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Get the first students information
        System.out.print("Student 1: ");
        String studentOneName = console.next();
        double studentOneGPA = console.nextDouble();
        int studentOneSAT = console.nextInt();
        int studentOneACT = console.nextInt();

        // Get the second students information
        System.out.print("Student 1: ");
        String studentTwoName = console.next();
        double studentTwoGPA = console.nextDouble();
        int studentTwoSAT = console.nextInt();
        int studentTwoACT = console.nextInt();

        // Find the better student
        int bestStudent = getBetterStudent(studentOneGPA, studentOneSAT, studentOneACT, studentTwoGPA, studentTwoSAT,
                studentTwoACT);

        // Print the results
        if (bestStudent == -1) {
            System.out.println("Students are equal");
        } else if (bestStudent == 1) {
            System.out.println(studentOneName + " is the better candidate");
        } else if (bestStudent == 2) {
            System.out.println(studentTwoName + " is the better candidate");
        }
    }

    // Returns the better student
    // Returns -1 of the students are equal
    public static int getBetterStudent(double studentOneGPA, int studentOneSAT, int studentOneACT, double studentTwoGPA,
            int studentTwoSAT, int studentTwoACT) {
        if (studentOneSAT * studentOneACT > studentTwoSAT * studentTwoACT) {
            return 1;
        } else if (studentOneSAT * studentOneACT < studentTwoSAT * studentTwoACT) {
            return 2;
        } else if (studentOneGPA > studentTwoGPA) {
            return 1;
        } else if (studentOneGPA < studentTwoGPA) {
            return 2;
        } else {
            return -1;
        }
    }
}
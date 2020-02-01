import java.util.*;

public class Grades {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Homework Grades
        System.out.print("Number of HW assignment? ");
        int homeworkCount = console.nextInt();

        // Create counters to keep track of score and possible score
        int cumulativeScore = 0;
        int cumulativePossible = 0;

        for (int i = 1; i <= homeworkCount; i++) {
            System.out.print("Homework " + i + " score and points possible: ");
            cumulativeScore += console.nextInt();
            cumulativePossible += console.nextInt();
        }

        // Midterm grade
        System.out.print("Midterm score, points possible, and curve: ");
        cumulativeScore += console.nextInt();
        cumulativePossible += console.nextInt();
        cumulativeScore += console.nextInt();

        // Final grade
        System.out.print("Final score, points possible, and curve: ");
        cumulativeScore += console.nextInt();
        cumulativePossible += console.nextInt();
        cumulativeScore += console.nextInt();

        // Print the grade
        String grade = getGrade(cumulativeScore, cumulativePossible);
        System.out.println("Grade = " + grade);
    }

    // Returns the grade for a student
    public static String getGrade(int cumulativeScore, int cumulativePossible) {
        // Get the percentage score
        double percent = (double) cumulativeScore / cumulativePossible;

        // Return the grade
        if (percent < 0.6) {
            return "F";
        } else if (percent < 0.7) {
            return "D";
        } else if (percent < 0.8) {
            return "C";
        } else if (percent < 0.9) {
            return "B";
        } else {
            return "A";
        }
    }
}
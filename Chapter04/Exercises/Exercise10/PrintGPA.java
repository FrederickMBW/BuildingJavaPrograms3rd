import java.util.*;

public class PrintGPA {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        printGPA(console);
    }

    public static void printGPA(Scanner console) {
        // Get the students name
        System.out.print("Enter a student record:  ");
        String name = console.next();

        // Get the number of scores
        int numberOfScores = console.nextInt();

        // Get the scores
        int total = 0;
        for (int i = 0; i < numberOfScores; i++) {
            total += console.nextInt();
        }

        // Calculate the students grade
        double grade = (double) total / numberOfScores;

        // Print the results
        System.out.print(name + "'s grade is " + grade);
    }
}
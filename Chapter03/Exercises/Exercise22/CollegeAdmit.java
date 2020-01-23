import java.util.Scanner;
import java.lang.Math;

public class CollegeAdmit {
    public static void main(String[] args) {
        System.out.println("University admission Program!");
        Scanner console = new Scanner(System.in);
        System.out.print("What is your GPA? ");
        double gpa = console.nextDouble();
        System.out.print("What is your SAT score? ");
        int sat = console.nextInt();
        admissionMessage(sat, gpa);
    }

    public static void admissionMessage(int sat, double gpa) {
        // Declare and initialize the minimum allowed scores
        int minSAT = 900;
        int minGPA = 18;

        // Convert GPA to a integer
        int convertedGPA = (int) Math.floor(gpa * 10);

        // Remove the min SAT score required from the actual SAT score
        for (int i = 0; i < minSAT; i++) {
            sat--;
        }

        // Remove the min GPA score required from the actual GPA score
        for (int i = 0; i < minGPA; i++) {
            convertedGPA--;
        }

        // If the modified SAT score is below zero, print to the console not accepted
        // This means the SAT score is less than the minimum required SAT score
        for (int i = sat; i < 0; i++) {
            System.out.println("You are NOT accepted");
            return;
        }

        // If the modified GPA score is below zero, print the the console not accepted
        // This means the GPA score is less than the minimum required GPA
        for (int i = convertedGPA; i < 0; i++) {
            System.out.println("You are NOT Accepted");
            return;
        }

        // Print the the console accepted
        System.out.println("You were accepted!");
    }
}
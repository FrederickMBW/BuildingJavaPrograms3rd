// This will only work with lastname/firstname

import java.util.Scanner;

public class ProcessName {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        processName(console);
    }

    public static void processName(Scanner console) {
        System.out.print("Please enter your full name: ");
        String first = console.next();
        String last = console.nextLine();
        System.out.println("Your name in revers order is " + last + ", " + first);
    }
}
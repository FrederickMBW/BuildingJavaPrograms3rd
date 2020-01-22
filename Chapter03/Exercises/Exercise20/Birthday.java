import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        inputBirthday(console);
    }

    public static void inputBirthday(Scanner console) {
        System.out.print("On what day of the month were you born? ");
        int day = console.nextInt();
        System.out.print("What is the name of the month in which you were born? ");
        String month = console.next();
        System.out.print("During what year were you born? ");
        int year = console.nextInt();
        System.out.println("You were born on " + month + " " + day + ", " + year + ". You're mighty old!");
    }
}
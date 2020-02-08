import java.util.*;

public class BoyGirl {
    public static void main(String[] args) {
        Scanner input = new Scanner(args[0]);

        boyGirl(input);
    }

    // I'll assume valid input (each name is followed by an integer)
    public static void boyGirl(Scanner input) {
        int boyCount = 0;
        int girlCount = 0;
        int boyTotal = 0;
        int girlTotal = 0;

        while (input.hasNext()) {
            boyCount++;
            input.next();
            boyTotal += input.nextInt();

            if (input.hasNext()) {
                girlCount++;
                input.next();
                girlTotal += input.nextInt();
            }
        }

        System.out.println(boyCount + " boys, " + girlCount + " girls");
        System.out.println("Difference between boys and girls sums: " + Math.abs(girlTotal - boyTotal));
    }
}
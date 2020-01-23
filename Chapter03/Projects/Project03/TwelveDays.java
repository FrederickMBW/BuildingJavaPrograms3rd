public class TwelveDays {
    public static void main(String[] args) {
        // Start tracking the total number of presents
        int totalPresents = 0;


        System.out.println("Day\tPresents\tTotal");
        for (int i = 1; i <= 12; i++) {
            totalPresents += i;

            System.out.println(i + "\t" + i + "\t\t" + totalPresents);
        }
    }
}
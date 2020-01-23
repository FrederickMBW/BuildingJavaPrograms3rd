// I should clean this up...

public class Interest {
    public static void main(String[] args) {
        double interestRate = 0.065;
        int base = 1000;
        int annualDeposit = 100;
        int years = 25;

        printTable(interestRate, base, annualDeposit, years);
    }

    public static void printTable(double interestRate, int base, int annualDeposit, int years) {
        // Print a entry for every year
        double currentBalance = (double) base;
        for (int i = 1; i <= years; i++) {
            double interest = currentBalance * interestRate;
            currentBalance += interest + annualDeposit;

            //Print the year
            System.out.print("Year: " + i + "\t");

            // Print the current balance
            System.out.print("Balance: " + currentBalance + "\t");

            // Print out the interest
            System.out.print("Interest: " + interest + "\t");

            // Print out the new deposit
            System.out.println("Deposit: " + annualDeposit);
        }
    }
}
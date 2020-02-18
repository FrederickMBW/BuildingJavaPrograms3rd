// Each BankAccount object represents one user's account
// information including name and balance of money
public class BankAccount {
    String name;
    double balance;
    double transactionFee;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount - transactionFee < 0) {
            return;
        }

        balance -= amount - transactionFee;
    }

    public void setTransactionFee(double fee) {
        if (fee  < 0) {
            throw new IllegalArgumentException();
        }

        transactionFee = fee;
    }

    public String toString() {
        return name + ", " + balance;
    }
}
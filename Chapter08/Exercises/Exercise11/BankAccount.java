// Each BankAccount object represents one user's account
// information including name and balance of money
public class BankAccount {
    String name;
    double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
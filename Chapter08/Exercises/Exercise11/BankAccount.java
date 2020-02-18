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
        if (balance >= 0) {
            return name + String.format(", $%.2f", balance);
        } else {
            return name + String.format(", -$%.2f", Math.abs(balance));
        }
    }

    public void transfer(BankAccount other, double amount) {
        // Do nothing if they can't afford the fee
        if (balance < 5 || amount == 0) {
            return;
        }

        // Subtract the transfer fee of $5 from this account
        balance -= 5;

        // Transfer the money
        if (amount > balance) {
            other.balance += this.balance;
            this.balance = 0;
        } else {
            other.balance += amount;
            this.balance -= amount;
        }
    }
}
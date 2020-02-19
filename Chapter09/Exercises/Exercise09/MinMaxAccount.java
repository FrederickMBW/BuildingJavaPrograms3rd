public class MinMaxAccount extends BankAccount {
    private int min;
    private int max;

    public MinMaxAccount(Startup s) {
        super(s);
        this.min = super.getBalance();
        this.min = super.getBalance();
    }

    public void debit(Debit d) {
        super(d);
        updateMinMax();
    }

    public void credit(Credit c) {
        super(c);
        updateMinMax();
    }

    private void updateMinMax() {
        if (super.getBalance() < min) {
            this.min = super.getBalance();
        } else if (super.getBalance > max) {
            this.max = super.getBalance();
        }
    }
    
    public int getMin() {
        return this.min;
    }

    public int getMax() {
        return this.max;
    }
}
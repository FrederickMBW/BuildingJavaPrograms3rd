public class Cash implements Asset {
    private double amount;

    public Cash(double amount) {
        this.amount = amount;
    }

    public double getMarketValue() {
        return amount;
    }

    public double getProfit() {
        return 0.0;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean equals(Object o) {
        if (o instanceof Cash) {
            Cash cash = (Cash) o;
            return this.amount == cash.amount;
        } 
        return false;
    }
}
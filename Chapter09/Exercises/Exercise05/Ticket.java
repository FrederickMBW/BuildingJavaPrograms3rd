public abstract class Ticket {
    int number;
    double price;

    public Ticket() {
        this.number = 0;
        this.price = 0;
    }

    public Ticket(int number) {
        this.number = number;
    }

    public String toString() {
        return String.format("Number: %d, Price: %.2f", this.number, this.price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
}
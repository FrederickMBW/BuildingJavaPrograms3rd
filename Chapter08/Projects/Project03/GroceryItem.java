public class GroceryItem {
    // Class fields
    String name;
    int quantity;
    double cost;

    // Constructor
    public GroceryItem(String name, int quantity, double cost) {
        if (name == null || name.length() < 1 || quantity < 1 || cost < 0) {
            throw new IllegalArgumentException();
        }

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }

    // Returns the total cost for this item
    public double getCost() {
        return cost * quantity;
    }

    // Set the quantity
    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException();
        }

        this.quantity = quantity;
    }
}
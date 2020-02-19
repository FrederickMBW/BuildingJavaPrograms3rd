public class GroceryList {
    // Class Constants
    public static final int MAX_SIZE = 10;

    // Class fields
    GroceryItem[] items;
    int count;

    // Constructors
    public GroceryList() {
        this.items = new GroceryItem[MAX_SIZE];
        this.count = 0;
    }

    // Adds the given item order to this list if the list has fewer than 10 items
    public void add(GroceryItem item) {
        if (count < 10) {
            items[count] = item;
            count++;
        }
    }

    // Returns the total sum cost of all grocery items in this list
    public double getTotalCost() {
        double totalCost = 0;

        for (int i = 0; i < count; i++) {
            totalCost += items[i].getCost();
        }

        return totalCost;
    }
}
public class StudentAdvancedTicket extends AdvancedTicket {
    public StudentAdvancedTicket(int number, int numberOfDaysBefore) {
        super(number, numberOfDaysBefore);
        super.setPrice(super.getPrice() / 2);
    }

    public String toString() {
        return super.toString() + " (ID required)";
    }
}
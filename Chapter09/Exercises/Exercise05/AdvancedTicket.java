public class AdvancedTicket extends Ticket {
    public AdvancedTicket(int number, int numberOfDaysBefore) {
        super(number);
        
        if (numberOfDaysBefore >= 10) {
            super.setPrice(30.0);
        } else {
            super.setPrice(40.0);
        }
    }

    public AdvancedTicket() {
        super();
    }
}
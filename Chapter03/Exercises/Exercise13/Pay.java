public class Pay {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i += 2) {
            System.out.println(pay(Double.parseDouble(args[i]), Integer.parseInt(args[i + 1])));
        }
    }

    public static double pay(double salary, int hours) {
        // Calculate the standard pay
        double pay = salary * hours;

        // Add in the overtime!
        for (int i = 9; i <= hours; i++) {
            pay += salary * 0.5;
        }

        return pay;
    }
}
public class Average {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        System.out.println(average(n1, n2));
    }

    public static double average(int n1, int n2) {
        return (n1 + n2) / 2.0;
    }
}
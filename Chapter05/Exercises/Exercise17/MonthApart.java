public class MonthApart {

    public static void main(String[] args) {
        int m1 = Integer.parseInt(args[0]);
        int d1 = Integer.parseInt(args[1]);
        int m2 = Integer.parseInt(args[2]);
        int d2 = Integer.parseInt(args[3]);

        System.out.println(monthApart(m1, d1, m2, d2));       
    }    

    // Returns true if the given dates are more than a month apart
    // Returns false otherwise
    // Assumes all dates happen in the same year (removes edge cases)
    public static boolean monthApart(int m1, int d1, int m2, int d2) {
        if (Math.abs(m1 - m2) > 1) {
            return true;
        } 

        if (m1 < m2 && d2 > d1 || m2 < m1 && d1 > d2) {
            return true;
        } 

        return false;
    }
}
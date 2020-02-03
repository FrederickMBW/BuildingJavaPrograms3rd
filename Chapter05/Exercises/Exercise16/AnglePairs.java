public class AnglePairs {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        System.out.println(anglePairs(n1, n2, n3));       
    }

    // Returns true if any of the two integers are complementary or supplementary angles
    // Returns false otherwise
    public static boolean anglePairs(int n1, int n2, int n3) {
        if (n1 <= 0 || n2 <=0 || n3 <= 0) {
            throw new IllegalArgumentException();
        }

        if (n1 + n2 == 90 || n2 + n3 == 90 || n1 + n3 == 90) { // Check for complementary angles
            return true;
        } else if (n1 + n2 == 180 || n2 + n3 == 180 || n1 + n3 == 180) { // Check for supplementary angles
            return true;
        } else {
            return false;
        }
    }
}
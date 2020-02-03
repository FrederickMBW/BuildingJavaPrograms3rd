public class HasMidpoint {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        System.out.println(hasMidpoint(n1, n2, n3));       
    }

    // Returns true if the one of the three numbers is a midpoint between the other two
    // Returns false otherwise
    public static boolean hasMidpoint(int n1, int n2, int n3) {
        // Sort the three numbers
        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        if (n2 > n3) {
            int temp = n2;
            n2 = n3;
            n3 = temp;
        }

        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        
        return (n1 + n3) / 2 == n2 && (n1 + n3) % 2 == 0;
    }
}
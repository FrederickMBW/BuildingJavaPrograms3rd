public class Dominant {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        System.out.println(dominant(n1, n2, n3));       
    }

    // Returns true if n1, n2, or n3 is greater than the sum of the other two integers
    // Returns false otherwise
    public static boolean dominant(int n1, int n2, int n3) {
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
        
        return n3 > (n1 + n2);
    }    
}
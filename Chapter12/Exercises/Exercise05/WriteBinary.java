public class WriteBinary {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        writeBinary(n);
    }

    public static void writeBinary(int n) {
        if (n == 0) {
            return;
        } 
        
        writeBinary(n / 2);
        if (n % 2 == 0) {
            System.out.print("0");
        } else {
            System.out.print("1");
        }
    }
}
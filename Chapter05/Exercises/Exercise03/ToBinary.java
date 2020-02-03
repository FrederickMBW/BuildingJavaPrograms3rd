public class ToBinary {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        System.out.println(toBinary(n));
    }

    // Converts the given string to binary and returns it as a String
    // Only works for positive integers
    public static String toBinary(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n == 0) {
            return "0";
        }

        String binary = "";

        while (n > 0) {
            if (n % 2 == 0) {
                binary = "0" + binary;
            } else {
                binary = "1" + binary;
            }
            n /= 2;
        }

        return binary;
    }
}
public class PrintTriangleType {
    public static void main(String[] args) {
        int s1 = Integer.parseInt(args[0]);
        int s2 = Integer.parseInt(args[1]);
        int s3 = Integer.parseInt(args[2]);

        printTriangleType(s1, s2, s3);
    }

    public static void printTriangleType(int s1, int s2, int s3) {
        if (s1 + s2 < s3 || s2 + s3 < s1 || s1 + s3 < s2) {
            throw new IllegalArgumentException();
        }

        if (s1 == s2 & s2 == s3) {
            System.out.println("equilateral");
        } else if (s1 == s2 || s2 == s3 || s1 == s3) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }
    }
}
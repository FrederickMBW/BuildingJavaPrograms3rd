public class Fibonacci {
    public static void main(String[] args) {
        int prev1 = 1;
        int prev2 = 1;
        System.out.print("1 1 ");
        for(int i = 3; i <= 12; i++) {
            int next = prev1 + prev2;
            System.out.print(next + " ");
            prev1 = prev2;
            prev2 = next;
        }
    }
}
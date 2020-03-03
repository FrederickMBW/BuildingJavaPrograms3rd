public class DigitMatch {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        System.out.println(digitMatch(n1, n2));
    }

    public static int digitMatch(int n1, int n2) {
        if (n1 < 0 || n2 < 0) {
            throw new IllegalArgumentException();
        }

        if (n1 == 0 || n2 == 0) {
            if (n1 % 10 == 0 || n2 % 10 == 0) {
                return 1;
            } else if (n1 == 0 && n2 == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        if (n1 % 10 == n2 % 10) {
            if (n1 < 10 || n2 < 10) {
                return 1;
            } else {
                return 1 + digitMatch(n1 / 10, n2 / 10);
            }
        } else {
            if (n1 < 10 || n2 < 10) {
                return 0;
            } else {
                return digitMatch(n1 / 10, n2 / 10);
            }
        }
    }
}
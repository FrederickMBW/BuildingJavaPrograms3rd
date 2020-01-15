public class StarFigures {
    public static void main(String[] args) {
        printTwoBars();
        printX();
        System.out.println();
        printTwoBars();
        printX();
        printTwoBars();
        System.out.println();
        printVerticalLine();
        printTwoBars();
        printX();
    }

    public static void printTwoBars() {
        System.out.println("*****");
        System.out.println("*****");
    }

    public static void printX() {
        System.out.println(" * * ");
        System.out.println("  *  ");
        System.out.println(" * * ");
    }

    public static void printVerticalLine() {
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
    }
}
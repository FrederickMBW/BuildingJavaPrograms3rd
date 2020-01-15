public class Lanterns {
    public static void main(String[] args) {
        printLampCap();
        System.out.println();
        printLampCap();
        printLampMiddle();
        print13Stars();
        printLampCap();
        System.out.println();
        printLampCap();
        print05Stars();
        printLampMiddle();
        printLampMiddle();
        print05Stars();
        print05Stars();
    }

    public static void printLampMiddle() {
        System.out.println("* | | | | | *");
    }

    public static void printLampCap() {
        print05Stars();
        print09Stars();
        print13Stars();
    }

    public static void print05Stars() {
        System.out.println("    *****    ");
    }

    public static void print09Stars() {
        System.out.println("  *********  ");
    }

    public static void print13Stars() {
        System.out.println("*************");
    }
}
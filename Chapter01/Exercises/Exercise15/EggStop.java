public class EggStop {
    public static void main(String[] args) {
        printEggTop();
        printEggBotton();
        printEggBotton();
        printEggMiddle();
        printEggTop();
        printEggStop();
        printEggBotton();
        printEggTop();
        printEggMiddle();
    }

    public static void printEggTop() {
        System.out.println("  _______  ");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }

    public static void printEggMiddle() {
        System.out.println("-\"-'-\"-\'-\"-");
    }

    public static void printEggBotton() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }

    public static void printEggStop() {
        System.out.println("|   STOP  |");
    }
}
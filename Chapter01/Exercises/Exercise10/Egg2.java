public class Egg2 {
    public static void main(String[] args) {
        printEggTop();
        printEggBotton();
        printEggMiddle();
        printEggTop();
        printEggBotton();
        printEggMiddle();
        printEggBotton();
        printEggTop();
        printEggMiddle();
        printEggBotton();
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
}
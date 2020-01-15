public class FightSong {
    public static void main(String[] args) {
        printVerse1();
        System.out.println();
        printChorus();
        System.out.println();
        printChorus();
        System.out.println();
        printVerse1();
    }

    public static void printChorus() {
        printVerse1();
        printVerse2();
        printVerse1();
    }

    public static void printVerse1() {
        System.out.println("Go, team, go!");
        System.out.println("You can do it.");
    }

    public static void printVerse2() {
        System.out.println("You're the best,");
        System.out.println("In the West.");
    }
}
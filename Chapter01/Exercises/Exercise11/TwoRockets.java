// This is so ugly. I hate it.

public class TwoRockets {
    public static void main(String[] args) {
        printCones();
        drawBoxes();
        drawLogo();
        drawBoxes();
        printCones();
    }

    public static void printCones() {
        printConeSection1();
        printConeSection1();
        System.out.println();
        printConeSection2();
        printConeSection2();
        System.out.println();
        printConeSection3();
        printConeSection3();
        System.out.println();
    }

    public static void printConeSection1() {
        System.out.print("   /\\   ");
    }

    public static void printConeSection2() {
        System.out.print("  /  \\  ");
    }

    public static void printConeSection3() {
        System.out.print(" /    \\ ");
    }
    
    public static void drawBoxes() {
        drawBoxTopBottom();
        drawBoxTopBottom();
        System.out.println();
        drawBoxMiddle();
        drawBoxMiddle();
        System.out.println();
        drawBoxMiddle();
        drawBoxMiddle();
        System.out.println();
        drawBoxTopBottom();
        drawBoxTopBottom();
        System.out.println();
    }

    public static void drawBoxTopBottom() {
        System.out.print("+------+");
    }

    public static void drawBoxMiddle() {
        System.out.print("|      |");
    }

    public static void drawLogo() {
        drawLogoTop();
        drawLogoTop();
        System.out.println();
        drawLogoBottom();
        drawLogoBottom();
        System.out.println();
    }

    public static void drawLogoTop() {
        System.out.print("|United|");
    }

    public static void drawLogoBottom() {
        System.out.print("|States|");
    }
}
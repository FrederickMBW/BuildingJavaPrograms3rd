public class Stairs {
    public static final int STEPS = 5;

    public static void main(String[] args) {
        for (int i = 0; i < STEPS; i++) {
            //Draw the top row of the step
            //Draw the spaces in the top row
            for (int j = 0; j < -i + STEPS - 1; j++) {
                System.out.print("     ");
            }

            //Draw the head
            System.out.print("  0  ");

            //Draw top of step
            System.out.print("*****");

            //Draw the spaces to the right
            for (int j = 0; j < i; j++) {
                System.out.print("     ");
            }

            //Draw the right side of the stairs
            System.out.print("*");

            System.out.println();

            //Draw the middle row of the step
            //Draw the spaces in the middle row
            for (int j = 0; j < -i + STEPS - 1; j++) {
                System.out.print("     ");
            }

            //Draw the body
            System.out.print(" /|\\ ");

            //Draw the side of the step
            System.out.print("*    ");

            //Draw the spaces to the right
            for (int j = 0; j < i; j++) {
                System.out.print("     ");
            }

            //Draw the right side of the stairs
            System.out.print("*");

            System.out.println();

            //Draw the bottom row of the step
            //Draw the spaces for the bottom row
            for (int j = 0; j < -i + STEPS - 1; j++) {
                System.out.print("     ");
            }

            //Print out the legs
            System.out.print(" / \\ ");

            //Draw the side of the step
            System.out.print("*    ");

            //Draw the spaces to the right
            for (int j = 0; j < i; j++) {
                System.out.print("     ");
            }

            //Draw the right side of the stairs
            System.out.print("*");

            System.out.println();
        }

        //Draw the bottom of the stair case
        for (int i = 0 ; i < STEPS + 1; i++) {
            System.out.print("*****");
        }
        System.out.println("*");
    }
}
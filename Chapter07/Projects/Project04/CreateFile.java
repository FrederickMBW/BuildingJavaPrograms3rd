import java.io.*;
import java.util.*;

public class CreateFile {
    public static void main(String[] args) throws FileNotFoundException {
        //Get the file name from command line and create a file from it
        File file = new File(args[0]);

        // Create an output stream to the file
        PrintStream output = new PrintStream(file);

        // Random number generator
        Random rand = new Random();

        // Create 10 people in the file
        for (int i = 0; i < 10; i++) {
            output.printf("Name%d\n", i);
            for (int j = 0; j < 70; j++) {
                if (rand.nextInt(2) % 2 == 0) {
                    output.print("A");
                } else {
                    output.print("B");
                }
            }
            output.println();
        }

    }
}
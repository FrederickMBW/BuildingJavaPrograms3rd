import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < args.length; i++) {
            list.add(args[i]);
        }

        System.out.println(list);

        Clump.clump(list);

        System.out.println(list);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        String beginning = args[0];
        String ending = args[1];

        for (int i = 2; i < args.length; i++) {
            list.add(args[i]);
        }

        System.out.println(list);

        RemoveInRange.removeInRange(list, beginning, ending);

        System.out.println(list);
    }
}
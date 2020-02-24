import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < args.length; i++) {
            list.add(Integer.parseInt(args[i]));
        }

        System.out.println(list);

        Reverse3.reverse3(list);

        System.out.println(list);
    }
}
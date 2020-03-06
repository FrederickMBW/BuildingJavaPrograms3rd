import java.util.*;

public class SplitStack {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<Integer>();

        for (int i = args.length - 1; i >= 0; i--) {
            a.push(Integer.parseInt(args[i]));
        }

        System.out.println(a);

        splitStack(a);

        System.out.println(a);

        while(!a.isEmpty()) {
            System.out.println(a.pop());
        }
    }

    public static void splitStack(Stack<Integer> s) {
        // Create a queue as an auxiliary storage
        Queue<Integer> aux = new LinkedList<Integer>();

        // Move all the elements in the stack to the queue
        while(!s.isEmpty()) {
            aux.add(s.pop());
        }

        // Add every negative number back to the stack
        int size = aux.size();
        for (int i = 0; i < size; i++) {
            int next = aux.remove();

            if (next < 0) {
                s.push(next);
            } else {
                aux.add(next);
            }
        }

        // Add all the non negative numbers back to the stack
        while (!aux.isEmpty()) {
            s.push(aux.remove());
        }
    }
}
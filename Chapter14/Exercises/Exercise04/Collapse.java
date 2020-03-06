import java.util.*;

public class Collapse {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<Integer>();

        for (int i = 0; i < args.length; i++) {
            a.push(Integer.parseInt(args[i]));
        }

        System.out.println(a);
        
        collapse(a);

        System.out.println(a);
    }

    public static void collapse(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();

        // Create a stack with the reverse order of the given stack
        stackToQueue(s, q);
        queueToStack(q, s);

        // Put every element in the queue
        stackToQueue(s, q);

        // Collapse the rest of the elements back into the stack
        while(!q.isEmpty() && q.size() > 1) {
            s.push(q.remove() + q.remove());
        }

        // Add the last element back to the stack if odd number of elements
        if (!q.isEmpty() && q.size() % 2 != 0) {
            s.push(q.remove());
        }


    }

    public static void stackToQueue(Stack<Integer> s, Queue<Integer> q) {
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void queueToStack (Queue<Integer> q, Stack<Integer> s) {
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    }
}
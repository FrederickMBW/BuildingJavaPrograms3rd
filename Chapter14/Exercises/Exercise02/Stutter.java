import java.util.*;

public class Stutter {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<Integer>();

        for (int i = args.length - 1; i >= 0; i--) {
            a.push(Integer.parseInt(args[i]));
        }

        System.out.println(a);

        stutter(a);

        System.out.println(a);
    }

    public static void stutter(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();

        // Create a stack with the reverse order of the given stack
        stackToQueue(s, q);
        queueToStack(q, s);

        // Put every element in the queue
        stackToQueue(s, q);

        // Put everything back in the stack with a stutter
        while(!q.isEmpty()) {
            int n = q.remove();
            s.push(n);
            s.push(n);
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
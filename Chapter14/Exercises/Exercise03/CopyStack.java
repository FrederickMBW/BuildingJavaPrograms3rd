import java.util.*;

public class CopyStack {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<Integer>();

        for (int i = args.length - 1; i >= 0; i--) {
            a.push(Integer.parseInt(args[i]));
        }

        System.out.println(a);

        Stack<Integer> copy = copyStack(a);

        System.out.println(a);
        System.out.println(copy);
    }

    public static Stack<Integer> copyStack(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();
        Stack<Integer> result = new Stack<Integer>();

        // Create a stack with the reverse order of the given stack
        stackToQueue(s, q);
        queueToStack(q, s);

        // Put every element in the queue
        stackToQueue(s, q);

        // Put everything back in the stack with a stutter
        while(!q.isEmpty()) {
            int n = q.remove();
            s.push(n);
            result.push(n);
        }

        return result;
        
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
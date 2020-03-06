import java.util.*;

public class SwitchPairs {
    public static void switchPairs(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();

        // get the order correct
        stackToQueue(s, q);
        queueToStack(q, s);
        stackToQueue(s, q);

        // switch the pairs while putting elements back into the stack
        while (!q.isEmpty() && q.size() > 1) {
            int n1 = q.remove();
            int n2 = q.remove();
            s.push(n2);
            s.push(n1);
        }

        if (!q.isEmpty()) {
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
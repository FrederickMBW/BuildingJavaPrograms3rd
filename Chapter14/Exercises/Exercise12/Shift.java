import java.util.*;

public class Shift {
    public static void shift(Stack<Integer> s, int n) {
        Queue<Integer> q = new LinkedList<Integer>();

        // Move everything in the stack to the queue in the original order
        stackToQueue(s, q);
        queueToStack(q, s);
        stackToQueue(s, q);

        // Move the first n elements to the back of the queue
        for (int i = 0; i < n; i++) {
            q.add(q.remove());
        }

        // Move all the elements into the stack
        queueToStack(q, s);

        // Reverse the order of the top n elements in the stack
        for (int i = 0; i < n; i++) {
            q.add(s.pop());
        }

        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    }

    public static void stackToQueue(Stack<Integer> s, Queue<Integer> q) {
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void queueToStack(Queue<Integer> q, Stack<Integer> s) {
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    }
}
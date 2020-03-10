import java.util.*;

public class Mirror {
    public static void mirror(Stack<Integer> s) {
        // Throw exceptions
        if (s == null) {
            throw new IllegalArgumentException();
        }

        // Create a queue
        Queue<Integer> q = new LinkedList<Integer>();

        // Get the size of the stack
        int size = s.size();

        // Move everything to the queue
        stackToQueue(s, q);

        // Copy every thing from the queue to the stack
        // while keeping everything in the queue
        for (int i = 0; i < size; i++) {
            s.push(q.peek());
            q.add(q.remove());
        }

        // Move every element from the stack to the end of the queue
        stackToQueue(s, q);

        // Rotate the the front half of the queue to the rear of the queue
        for (int i = 0; i < size; i++) {
            q.add(q.remove());
        }

        // Move all elements from the queue to the stack
        queueToStack(q, s);
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
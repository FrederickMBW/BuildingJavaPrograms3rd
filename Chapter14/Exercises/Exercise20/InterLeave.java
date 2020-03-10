import java.util.*;

public class InterLeave {
    public static void interleave(Queue<Integer> q) {
        // Throw exceptions
        if (q == null || q.size() % 2 != 0) {
            throw new IllegalArgumentException();
        }        

        // Do nothing if size == 0
        if (q.size() == 0) {
            return;
        }

        // Create a stack for aux storage
        Stack<Integer> s = new Stack<Integer>();

        // Get the size of the queue to use later
        int size = q.size();

        // Put front half of the queue in the stack in the correct order
        for (int i = 0; i < size / 2; i++) {
            s.push(q.remove());
        }

        stackToQueue(s, q);

        for (int i = 0; i < size / 2; i++) {
            q.add(q.remove());
        }

        for (int i = 0; i < size / 2; i++) {
            s.push(q.remove());
        }

        // Interleave the elements into the queue
        while (!s.isEmpty()) {
            q.add(s.pop());
            q.add(q.remove());
        }
    }

    private static void stackToQueue(Stack<Integer> s, Queue<Integer> q) {
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    private static void queueToStack (Queue<Integer> q, Stack<Integer> s) {
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    }
}
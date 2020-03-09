import java.util.*;

public class IsConsecutive {
    public static boolean isConsecutive(Stack<Integer> s) {
        // Return true if stack size is less than 2 or stack is null
        if (s == null || s.size() < 2) {
            return true;
        }

        // Create a queue for aux storage
        Queue<Integer> q = new LinkedList<Integer>();

        // Get the integers in the correct order in the queue
        stackToQueue(s, q);
        queueToStack(q, s);
        stackToQueue(s, q);

        // Check if the given stack is consectutive
        boolean stackIsConsecutive = true;

        int prev = q.remove();

        while (!q.isEmpty()) {
            int current = q.remove();
            if (current != prev + 1) {
                stackIsConsecutive = false;
            }
            s.push(prev);
            prev = current;
        }
        s.push(prev);

        return stackIsConsecutive;
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